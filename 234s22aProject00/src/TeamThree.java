public class TeamThree extends Team
{
    public TeamThree(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Tyler Valentine"));
        members.add(new TeamMember("Reed Sturza"));
        members.add(new TeamMember("Fred Flintstone"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
