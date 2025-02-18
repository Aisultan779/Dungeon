# MUD Adventure Game 🎮🗺️

Добро пожаловать в **MUD Adventure Game** – захватывающее текстовое приключение в жанре MUD (Multi-User Dungeon) на Java! 🏰👾 Здесь вы сможете исследовать удивительный мир, сражаться с монстрами, торговаться с торговцами и перемещаться между локациями – всё через удобный консольный интерфейс! 💥🔮

В этой игре вы управляете своим персонажем, который начинает своё приключение в "Начальной комнате". Используйте команды для изучения окружающего мира, перехода между локациями (например, "Замок Дракулы" или "Пустоши"), ведения боёв с монстрами и торговли с торговцами. Всё это делает игру динамичной, увлекательной и полной неожиданных поворотов! 🌍✨

## Как установить и запустить


Как играть
Игра работает в режиме консольного ввода. Вот список команд, которые помогут вам начать ваше приключение:

look – осмотреться и узнать, что находится вокруг вас 👀.
move <направление> – переместиться в другую комнату.
Например:
move east – войти в Замок Дракулы 🏰.
move west – отправиться в Пустоши 🌵.
pick <предмет> – подобрать предмет (текущая логика – заглушка) 🎁.
inventory – просмотреть содержимое инвентаря 🎒.
attack <имя_npc> – атаковать монстра (например, attack goblin) ⚔️.
trade <имя_npc> – торговаться с торговцем (например, trade merchant) 💸.
help – вывести список всех доступных команд 📜.
quit или exit – выйти из игры 🚪.
Советы по игре
Исследуйте мир: Используйте команду look для изучения текущей комнаты и поиска скрытых секретов 🔍.
Будьте осторожны в боях: Следите за своим здоровьем, ведь монстры могут контратаковать! 💥
Торговля: Торговцы помогут вам пополнить инвентарь ценными предметами – не забывайте проверять их ассортимент 👛.
Навигация: Используйте доступные направления для перемещения между локациями и открытия новых областей 🌍.
Структура проекта
Все файлы расположены в одном пакете com.example.mud для удобства:

MUDGame.java – точка входа в игру.
MUDController.java – обработка команд и игровой цикл.
Room.java – описание комнат, их соседей и NPC.
NPC.java, Monster.java, Merchant.java – классы для NPC, монстров и торговцев.
Item.java – описание предметов.
Player.java – класс игрока, его инвентарь и система здоровья.
