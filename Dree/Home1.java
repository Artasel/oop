package Dree;
// Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом. Идея: описать 
// некоторое количество компонент, например: модель человека компонента хранения связей и отношений между людьми: родитель, 
// ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. компонент для проведения исследований 
// дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение 
// отдельных моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека. Описать с 
// ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены должны быть у каждого из 
// классов (у меня на семинаре студенты пришли к тому, чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа 
// мужу, после чего эту дверцу можно открыть) Подумать как описать логику взаимодействия человека и домашнего питомца. 
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. Какое ещё взаимодействие может быть? Продумать какие проблемы 
// могут возникнуть в том, коде, который они написали. Например в первой задаче (с генеалогическим древом) мы можем знать о двух 
// людях, но не знаем в каких “отношениях” они были - двоюродные или троюродные, или мы точно знаем как звали прапрабабушку, но 
// совершенно не знаем прабабушку - как хранить такие связи или что будет если в компоненту обхода передать ссылку на null-дерево. 
// У задач нет единственного правильного решения

import java.io.IOException;

//*Запуск проги и ее логика */
public class Home1 {
    public static void main(String[] args) throws IOException {
        Man qwe = new Man("Алексей", "Бобкин", "Ильич", "Надежда Юрьевна", "Илья Петрович");

        Man qwer = new Man("Михаил", "Кузнецов", "Степанович", "Оксана Викторовна", "Степан Михайлович");

        Man qwer2 = new Man("Сергей", "Калинкин", "Сергеевич", "Юлия Александровна", "Алексей Ильич");

        Man qwer3 = new Man("Михаил", "Рожков", "Михайлович", "Оля Витальевна ", "Алексей Ильич");

        Hud.hello();

        while (true) {
            String choice = Hud.opportunities();    

            if(choice.equals("1")){
                Man.readList();
            }

            if(choice.equals("2")){
                Man.addMan();
            }

            if(choice.equals("3")){
                Man.delMan();
            }

            if (choice.equals("4")) {
                String cont = Man.searchMan();
                Relationships.searChildren(cont);
            }
            
            if (choice.equals("5")) {
                System.out.println("Досвидания!");
                break;
            }
        }
    }
}