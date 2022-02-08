

public class TeamThree extends Team{
    public TeamThree(String name){
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers(){
        members.add(new TeamMember("Bryan Cohen"));
    }
}
