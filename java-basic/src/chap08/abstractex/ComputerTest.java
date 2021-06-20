package chap08.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer computer = new Computer(); // 에러 나옴
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
        myNote.typing();
    }
}
