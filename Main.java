package com.JohnnyGomezzz;

public class Main {

    public static void main(String[] args) {

        Object[] participants =     // создаём массив Участники
                {
                        new Human("Антон", 1.5, 1000),
                        new Robot("T1000", 1, 2000),
                        new Cat("Мурзик", 2, 500)
                };

        Object[] obstacles =        // создаём массив Препятствия
                {
                        new Wall(0.4),
                        new Track(500),
                        new Wall(1.2),
                        new Track(1500),
                        new Wall(1.6),
                        new Track(2500)
                };

        for (Object participant : participants) {

            for (Object obstacle : obstacles) {     // массивом Участники перебираем массив Препятствия

                if (participant instanceof Human && // участник Человек проходит препятствие Стена
                        obstacle instanceof Wall) {

                    if (((Human) participant).getJumpHeight() >= ((Wall)obstacle).getHeight())
                    {
                        ((Human) participant).jump();

                    } else {
                        ((Human) participant).notJump();
                        break;
                    }
                }

                if (participant instanceof Human &&  // участник Человек проходит препятствие Дорожка
                        obstacle instanceof Track) {

                    if (((Human) participant).getRunLength() >= ((Track)obstacle).getLength())
                    {
                        ((Human) participant).run();

                    } else {
                        ((Human) participant).notRun();
                        break;
                    }
                }

                if (participant instanceof Robot &&  // участник Робот проходит препятствие Стена
                        obstacle instanceof Wall){

                    if (((Robot) participant).getJumpHeight() >= ((Wall)obstacle).getHeight())
                    {
                        ((Robot) participant).jump();

                    } else {
                        ((Robot) participant).notJump();
                        break;
                    }
                }

                if (participant instanceof Robot &&  // участник Робот проходит препятствие Дорожка
                        obstacle instanceof Track){

                    if (((Robot) participant).getRunLength() >= ((Track)obstacle).getLength())
                    {
                        ((Robot) participant).run();

                    } else {
                        ((Robot) participant).notRun();
                        break;
                    }
                }

                if (participant instanceof Cat &&  // участник Кот проходит препятствие Стена
                        obstacle instanceof Wall) {

                    if (((Cat) participant).getJumpHeight() >= ((Wall)obstacle).getHeight())
                    {
                        ((Cat) participant).jump();

                    } else {
                        ((Cat) participant).notJump();
                        break;
                    }
                }

                if (participant instanceof Cat &&  // участник Кот проходит препятствие Дорожка
                        obstacle instanceof Track) {

                    if (((Cat) participant).getRunLength() >= ((Track)obstacle).getLength())
                    {
                        ((Cat) participant).run();

                    } else {
                        ((Cat) participant).notRun();
                        break;
                    }
                }
            }
        }
    }
}
