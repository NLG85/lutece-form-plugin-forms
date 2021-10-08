package fr.paris.lutece.plugins.forms.service;

import java.util.List;

import fr.paris.lutece.plugins.forms.business.Control;
import fr.paris.lutece.plugins.forms.business.ControlHome;
import fr.paris.lutece.plugins.forms.business.FormDisplay;
import fr.paris.lutece.plugins.forms.business.FormDisplayHome;
import fr.paris.lutece.plugins.forms.business.Group;
import fr.paris.lutece.plugins.forms.business.GroupHome;
import fr.paris.lutece.plugins.forms.business.Question;
import fr.paris.lutece.plugins.forms.business.QuestionHome;
import fr.paris.lutece.plugins.forms.business.Step;
import fr.paris.lutece.plugins.forms.business.StepHome;
import fr.paris.lutece.plugins.genericattributes.business.Entry;
import fr.paris.lutece.plugins.genericattributes.business.EntryHome;
import fr.paris.lutece.plugins.genericattributes.business.Field;
import fr.paris.lutece.plugins.genericattributes.business.FieldHome;

public class FormDatabaseService implements IFormDatabaseService
{
    public static final String BEAN_NAME = "forms.formDatabaseService";
    
    @Override
    public void createEntry( Entry entry )
    {
        EntryHome.create( entry );
    }
    
    @Override
    public void createField( Field field )
    {
        FieldHome.create( field );
    }
    
    @Override
    public void createQuestion( Question question )
    {
        QuestionHome.create( question );
    }
    
    @Override
    public void createGroup( Group group )
    {
        GroupHome.create( group );
    }
    
    @Override
    public void updateGroup( Group group )
    {
        GroupHome.update( group );
    }
    
    @Override
    public Group findGroupByPrimaryKey( int idGroup )
    {
        return GroupHome.findByPrimaryKey( idGroup );
    }
    
    @Override
    public Step findStepByPrimaryKey( int idStep )
    {
        return StepHome.findByPrimaryKey( idStep );
    }
    
    @Override
    public void updateEntry( Entry entry )
    {
        EntryHome.update( entry );
    }
    
    @Override
    public void createFormDisplay( FormDisplay formDisplay )
    {
        FormDisplayHome.create( formDisplay );
    }
    
    @Override
    public List<Question> getListQuestionByForm( int nIdForm )
    {
        return QuestionHome.getListQuestionByIdForm( nIdForm );
    }
    
    @Override
    public Question findQuestionByPrimaryKey( int idQuestion )
    {
        return QuestionHome.findByPrimaryKey( idQuestion );
    }
    
    @Override
    public Entry findEntryByPrimaryKey( int idEntry )
    {
        return EntryHome.findByPrimaryKey( idEntry );
    }
    
    @Override
    public void updateField( Field field )
    {
        FieldHome.update( field );
    }
    
    @Override
    public Field findFieldByPrimaryKey( int idField )
    {
        return FieldHome.findByPrimaryKey( idField );
    }
    
    @Override
    public FormDisplay findDisplayByPrimaryKey( int idDisplay )
    {
        return FormDisplayHome.findByPrimaryKey( idDisplay );
    }
    
    @Override
    public void updateQuestion( Question question )
    {
        QuestionHome.update( question );
    }
    
    @Override
    public List<FormDisplay> getFormDisplayListByParent( int nIdStep, int nIdParent )
    {
        return FormDisplayHome.getFormDisplayListByParent( nIdStep, nIdParent );
    }
    
    @Override
    public void updateFormDisplay( FormDisplay formDisplay )
    {
        FormDisplayHome.update( formDisplay );
    }
    
    @Override
    public Entry copyEntry( Entry entry )
    {
        return EntryHome.copy( entry );
    }
    
    @Override
    public List<Control> getControlByQuestion( int nIdQuestion )
    {
        return ControlHome.getControlByQuestion( nIdQuestion );
    }
    
    @Override
    public FormDisplay getFormDisplayByFormStepAndComposite( int nIdForm, int nIdStep, int nIdComposite )
    {
        return FormDisplayHome.getFormDisplayByFormStepAndComposite( nIdForm, nIdStep, nIdComposite );
    }
    
    @Override
    public void createControl( Control control )
    {
        ControlHome.create( control );
    }
}
