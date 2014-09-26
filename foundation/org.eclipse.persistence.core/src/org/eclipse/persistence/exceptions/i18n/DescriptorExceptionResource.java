/*******************************************************************************
 * Copyright (c) 1998, 2014 Oracle, IBM Corporation and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 *     10/15/2010-2.2 Guy Pelletier 
 *       - 322008: Improve usability of additional criteria applied to queries at the session/EM
 *     09/24/2014-2.6 Rick Curtis 
 *       - 443762 : Misc message cleanup.
 ******************************************************************************/  
package org.eclipse.persistence.exceptions.i18n;

import java.util.ListResourceBundle;

/**
 * INTERNAL:
 * English ResourceBundle for DescriptorException messages.
 *
 * Creation date: (12/8/00 4:47:38 PM)
 * @author: Rick Barkhouse
 */
public class DescriptorExceptionResource extends ListResourceBundle {
    static final Object[][] contents = {
                                           { "1", "The attribute [{0}] is not declared as type ValueHolderInterface, but its mapping uses indirection." },
                                           { "2", "The attribute [{0}] is declared as type ValueHolderInterface, but its mapping does not use indirection." },
                                           { "6", "Attribute name is missing." },
                                           { "7", "The attribute [{0}] should be a type that implements {1}." },
                                           { "8", "The descriptor [{0}] has been set to use inheritance, but a class indicator field has not been defined. {2}When using inheritance, a class indicator field or class extraction method must be set. {2}Parent Descriptor: [{1}]" },
                                           { "9", "This mapping does not have a direct field name set." },
                                           { "10", "This mapping does not have a field name set." },
                                           { "11", "The foreign key information for this mapping is defined incorrectly." },
                                           { "12", "Descriptors must use an identity map in order to use the \"Check Cache\" existence checking option." },
                                           { "13", "The instance variable [{0}] in the object [{1}] is inaccessible." },
                                           { "14", "Problem in cloning the object [{0}].  The clone method [{1}] is not accessible." },
                                           { "15", "This class does not define a default constructor, which EclipseLink requires." },
                                           { "16", "The descriptor callback method [{0}], with parameter (DescriptorEvent), is inaccessible." },
                                           { "17", "Trying to access the method [{0}] on the object [{1}].  The underlying method is inaccessible." },
                                           { "18", "Illegal method access in a Transformation mapping using a ValueHolder." },
                                           { "19", "Illegal access while invoking the attribute method on a Transformation mapping.  The underlying method is inaccessible." },
                                           { "20", "The method [{0}] is inaccessible." },
                                           { "21", "Problem in extracting class from row [{0}].  The static method [{1}], with parameter (DatabaseRow), is not accessible." },
                                           { "22", "Problem in creating new instance.  The creation method [{0}] is not accessible." },
                                           { "23", "The descriptor callback method [{0}], with parameter (Session), is inaccessible." },
                                           { "24", "The instance variable [{0}] in the object [{1}] is inaccessible. {3}Argument: [{2}]" },
                                           { "25", "The method [{0}] with argument [{1}] is not accessible." },
                                           { "26", "Trying to get value for instance variable [{0}] of type [{1}] from the object [{2}].  The specified object is not an instance of the class or interface declaring the underlying field." },
                                           { "27", "Trying to invoke the method [{0}] on the object [{1}].  The number of actual and formal parameters differs, or an unwrapping conversion has failed." },
                                           { "28", "Illegal argument while instantiating a method-based proxy in a Transformation mapping." },
                                           { "29", "The number of actual and formal parameters differs, or an unwrapping conversion has failed." },
                                           { "30", "The number of actual and formal parameters differs for method [{0}], or an unwrapping conversion has failed." },
                                           { "31", "The number of actual and formal parameters for the descriptor callback method [{0}] differs, or an unwrapping conversion has failed." },
                                           { "32", "Trying to set value [{0}] for instance variable [{1}] of type [{2}] in the object.  The specified object is not an instance of the class or interface declaring the underlying field, or an unwrapping conversion has failed." },
                                           { "33", "Trying to invoke [{0}] on the object with the value [{1}].  The number of actual and formal parameters differs, or an unwrapping conversion has failed." },
                                           { "34", "This class does not define a public default constructor, or the constructor raised an exception." },
                                           { "35", "Invalid event." },
                                           { "36", "Invalid event code [{0}]." },
                                           { "37", "Invalid descriptor event code [{0}]." },
                                           { "38", "Identity map constructor failed because an invalid identity map was specified." },
                                           { "39", "This descriptor does not specify a Java class." },
                                           { "40", "Descriptor is missing for [{0}].  It was probably not added to the Session." },
                                           { "41", "A non-read-only mapping must be defined for the sequence number field." },
                                           { "43", "Missing class for indicator field value [{0}] of type [{1}]." },
                                           { "44", "Missing class indicator field from database row [{0}]." },
                                           { "45", "Missing mapping for field [{0}]." },
                                           { "46", "There should be one non-read-only mapping defined for the primary key field [{0}]." },
                                           { "47", "The multiple table primary key mapping must be specified when a custom multiple table join is used." },
                                           { "48", "Multiple writable mappings exist for the field [{0}].  Only one may be defined as writable, all others must be specified read-only." },
                                           { "49", "An attribute transformation method name is not specified for this mapping." },
                                           { "50", "A field name is not set for this mapping." },
                                           { "51", "No foreign keys have been specified for this mapping." },
                                           { "52", "No reference key has been specified for this mapping." },
                                           { "53", "The relation table name is not set for this mapping." },
                                           { "54", "There are no source relation keys specified for this mapping." },
                                           { "55", "The descriptor callback method [{0}] cannot be found.  It must take a Session or a DescriptorEvent as its argument." },
                                           { "56", "The method [{0}] with parameters (Record) or (Record, Session) is not found." },
                                           { "57", "Inaccessible constructor." },
                                           { "58", "The method [{0}] with parameters () or (Session) not found." },
                                           { "59", "The instance variable [{0}] is not defined in the domain class [{1}], or it is not accessible." },
                                           { "60", "The method [{0}] or [{1}] is not defined in the object [{2}]." },
                                           { "61", "The static class extraction method [{0}], with parameter (Record), does not exist, or is not accessible." },
                                           { "62", "The clone method [{0}], with no parameters, does not exist, or is not accessible." },
                                           { "63", "The instance creation method [{0}], with no parameters, does not exist, or is not accessible." },
                                           { "64", "No target foreign keys have been specified for this mapping." },
                                           { "65", "No target relation keys have been specified for this mapping." },
                                           { "66", "Could not deserialize object from byte array." },
                                           { "67", "Could not serialize object into byte array." },
                                           { "68", "The value of an aggregate in object [{0}] is null.  Null values not allowed for Aggregate mappings unless \"Allow Null\" is specified." },
                                           { "69", "A NullPointerException was thrown while extracting a value from the instance variable [{0}] in the object [{1}]." },
                                           { "70", "A NullPointerException was thrown while extracting a value through the method [{0}] in the object [{1}]." },
                                           { "71", "A NullPointerException was thrown while setting the value of the instance variable [{0}] to the value [{1}]." },
                                           { "72", "A NullPointerException was thrown while setting a value through the method [{0}] with argument [{1}]." },
                                           { "73", "Cannot find descriptor for parent class [{0}]." },
                                           { "74", "The primary key fields are not set for this descriptor." },
                                           { "75", "The reference class is not specified for this descriptor." },
                                           { "77", "The reference descriptor for [{0}] should be set to be an Aggregate descriptor." },
                                           { "78", "The reference field [{0}] for this mapping must exist in the reference table." },
                                           { "79", "The reference table is not specified for this mapping." },
                                           { "80", "The relation key field [{0}] for this mapping must exist in the relation table." },
                                           { "81", "The method [{0}] should return the type of the mapped attribute, not void." },
                                           { "82", "The descriptor callback method [{0}], with parameter (DescriptorEvent), is not accessible." },
                                           { "83", "The descriptor callback method [{0}], with parameter (Session), is not accessible." },
                                           { "84", "The method [{0}], with parameters (Record) or (Record, Session), is not accessible." },
                                           { "85", "The method [{0}], with parameters () or (Session), is not accessible." },
                                           { "86", "The instance variable [{0}] in the class [{1}] is not accessible." },
                                           { "87", "The methods [{0}], [{1}] in the object [{2}] are not accessible" },
                                           { "88", "The static class extraction method [{0}], with parameter (Record), is not accessible." },
                                           { "89", "The clone method [{0}], with no parameters, is not accessible." },
                                           { "90", "The instance creation method [{0}], with no parameters, is not accessible." },
                                           { "91", "To use sequence-generated IDs, both the \"Sequence Number Name\" and \"Sequence Number Field Name\" properties must be set for this descriptor." },
                                           { "92", "The size of the target''s primary key does not match the size of the foreign key." },
                                           { "93", "The table [{0}] is not present in this descriptor." },
                                           { "94", "Descriptors must have a table name defined." },
                                           { "96", "The number of target keys does not match the number of source keys." },
                                           { "97", "Problem cloning the object [{0}].  The clone method [{1}] triggered an exception." },
                                           { "98", "The underlying descriptor callback method [{0}], with parameter (DescriptorEvent), triggered an exception." },
                                           { "99", "The method [{0}] on the object [{1}] triggered an exception." },
                                           { "100", "A method has triggered an exception." },
                                           { "101", "The underlying method triggered an exception." },
                                           { "102", "The method [{0}] triggered an exception." },
                                           { "103", "Problem in extracting class from row [{0}], using static method [{1}], with parameter (DatabaseRow).  An exception was triggered." },
                                           { "104", "Problem in creating new instance using creation method [{0}].  The creation method triggered an exception." },
                                           { "105", "The underlying descriptor callback method [{0}], with parameter (Session), triggered an exception." },
                                           { "106", "The method [{0}] on the object is throwing an exception. {2}Argument: [{1}]" },
                                           { "108", "Cannot find value in class indicator mapping in parent descriptor [{0}]." },
                                           { "109", "This descriptor should not have a write lock field defined because it is a child descriptor. It inherits its parent descriptor''s write lock field." },
                                           { "110", "Descriptor is missing for class [{0}]." },
                                           { "111", "Multiple table primary key field names must be fully qualified." },
                                           { "112", "Only one table can be added by using setTableName(String). Use addTableName(String) to add multiple tables to a descriptor." },
                                           { "113", "The constructor was inaccessible." },
                                           { "114", "Problem in creating new instance using creation method [{0}].  The creation method is not accessible." },
                                           { "115", "No conversion value provided for the attribute [{0}]." },
                                           
    { "116", "No conversion value provided for the value [{0}] in field [{1}]." },
                                           
    { "118", "The object [{0}] must not have read-only mappings to its write lock fields." },
                                           { "119", "The object''s [{0}] mappings to its write lock fields must be read-only." },
                                           { "120", "The query key [{0}] is defined in the parent descriptor [{1}], but not in the child descriptor [{2}]." },
                                           { "122", "setExistenceCheck() with argument [{0}] is not understood." },
                                           { "125", "The mapping for the attribute [{0}] uses indirection, and so must be initialized to a new ValueHolder.  Currently the value is: [{1}]." },
                                           { "126", "No subclass matches this class [{0}] for this Aggregate mapping with inheritance." },
                                           { "127", "The get method for the attribute [{0}] does not return a ValueHolderInterface, but the mapping uses indirection." },
                                           { "128", "The get method for the attribute [{0}] returns a ValueHolderInterface, but the mapping does not use indirection." },
                                           { "129", "The set method for the attribute [{0}] does not take a ValueHolderInterface as its parameter, but the mapping uses indirection." },
                                           { "130", "The set method for the attribute [{0}] takes a ValueHolderInterface as its parameter, but the mapping does not use indirection." },
                                           { "131", "The get method for the attribute [{0}] should return a Vector (or a type that implements Map or Collection, if using Java 2)." },
                                           { "133", "The set method for the attribute [{0}] should take a Vector as its parameter (or a type that implements Map or Collection, if using Java 2)." },
                                           { "135", "The multiple table foreign key relationship refers to an unknown table [{0}]." },
                                           { "138", "The attribute [{0}] is of type [{1}] but the mapping uses transparent indirection (lazy loading), requiring it to be a superclass of [{2}]." },
                                           { "139", "The get method for the attribute [{0}] returns [{1}] but the mapping uses transparent indirection (lazy loading), requiring it to be a superclass of [{2}]." },
                                           { "140", "The set method for the attribute [{0}] takes [{1}] but the mapping uses transparent indirection (lazy loading), requiring it to be a superclass of [{2}]." },
                                           { "141", "The field [{0}] is not present in the table [{1}] in the database." },
                                           { "142", "The table [{0}] is not present in the database." },
                                           { "143", "The multiple table insert order Vector specified, [{0}], has more or fewer tables than are specified in the descriptor. {2}All of the tables [{1}] must be included in the insert order Vector." },
                                           { "144", "Transparent indirection can only be used with CollectionMappings." },
                                           { "145", "The indirect container class [{0}] must implement the constructor [{1}] with parameter (ValueHolderInterface)." },
                                           { "146", "The indirect container class [{0}] could not be instantiated using the constructor {1}(ValueHolderInterface)." },
                                           { "147", "The container policy [{0}] should only be used in JDK 1.1.x.  It was instantiated for [{1}]." },
                                           { "148", "The container policy [{0}] is not compatible with transparent indirection." },
                                           { "149", "NoIndirectionPolicy objects should not receive this message." },
                                           { "150", "The mapping for the attribute [{0}] uses transparent indirection so the attribute [{0}] must be initialized to an appropriate container.  Currently the value is [{1}]. {2} -  Must be instance of an implementor of Collection or Map." },
                                           { "151", "The operation [{0}] is invalid for this mapping." },
                                           { "152", "The operation [{1}] is invalid for this indirection policy [{0}]." },
                                           { "153", "The reference descriptor for [{0}] should be set to be an Aggregate Collection descriptor." },
                                           { "154", "The indirection container class [{0}] does not implement IndirectContainer." },
                                           { "155", "This mapping does not include a foreign key field linked to the primary key field [{0}]." },
                                           { "156", "The structure name is not set for this mapping." },
                                           { "157", "Normal descriptors do not support non-relational extensions." },
                                           { "158", "This descriptor''s parent class has been set to itself." },
                                           { "159", "Proxy indirection is available only in JDK 1.3-compliant or higher virtual machines." },
                                           { "160", "The attribute [{0}] of class [{1}] is typed as [{2}], which was not specified in the list of interfaces given to the useProxyIndirection() method. {4}Valid interfaces are: [{3}]." },
                                           { "161", "The method [{0}] in class [{1}] returns a value of type [{2}], which was not specified in the list of interfaces given to the useProxyIndirection() method. {4}Valid interfaces are: [{3}]." },
                                           { "162", "The method [{0}] in class [{1}] takes a parameter of type [{2}], which was not specified in the list of interfaces given to the useProxyIndirection() method.{4}Valid interfaces are: [{3}]." },
                                           { "163", "This mapping''s attribute class does not match the collection class.  [{1}] cannot be assigned to [{0}]." },
                                           { "164", "The amendment method [{1}], in amendment class [{0}], is invalid, not public, or cannot be found. {2}Descriptor amendment methods must be declared \"public static void\" with (ClassDescriptor) as the single parameter." },
                                           { "165", "This descriptor''s amendment method [{1}] in amendment class [{0}] triggered an exception." },
                                           { "166", "There is no mapping for the attribute [{0}]." },
                                           { "167", "A valid constructor was not found for the indirection container class [{0}]." },
                                           { "168", "Problem in creating new instance using the default constructor.  The default constructor triggered an exception." },
                                           { "169", "Problem in creating new instance of factory using the default constructor.  The default constructor triggered an exception." },
                                           { "170", "Problem (illegal access) in creating new instance of factory using the default constructor." },
                                           { "171", "The factory class does not define a public default constructor, or the constructor raised an exception." },
                                           { "172", "Factory constructor not found." },
                                           { "173", "The factory constructor was inaccessible." },
                                           { "174", "Problem in creating factory.  The creation method [{0}] is not accessible." },
                                           { "175", "Problem creating factory using creation method [{0}].  The creation method triggered an exception." },
                                           { "176", "Problem in creating factory using creation method [{0}].  The creation method is not accessible." },
                                           { "177", "Mapping is missing for the attribute: [{0}]." },
                                           { "178", "Cannot find mapping for attribute [{0}] in entity bean [{1}]. The attribute must mapped." },
                                           { "179", "The attribute, [{0}] uses Bidirectional Relationship Maintenance, but has ContainerPolicy, [{1}] which does not support it.  The attribute should be mapped with a different collection type." },
                                           { "181", "The AttributeTransformer class, [{0}] cannot be found." },
                                           { "182", "The FieldTransformer class, [{0}] cannot be found." },
                                           { "183", "The class, [{0}] cannot be used as an AttributeTransformer." },
                                           { "184", "The class, [{0}] cannot be used as a FieldTransformer." },
                                           { "185", "ReturningPolicy contains field, [{0}] with two different types: [{1}] and [{2}]." },
                                           { "186", "ReturningPolicy contains field, [{0}] added twice: using addInsertField and addInsertFieldReturnOnly." },
                                           { "187", "ReturningPolicy contains field, [{0}] with type [{1}], but the same field in descriptor has type [{2}]." },
                                           { "188", "ReturningPolicy contains unmapped field, [{0}] which requires type." },
                                           { "189", "ReturningPolicy contains mapped field, [{0}] which requires type." },
                                           { "190", "ReturningPolicy contains field, [{0}] mapped with [{1}] mapping which is not supported." },
                                           { "191", "ReturningPolicy contains field, [{0}] which is not supported: it is either sequence field, or class type indicator, or used for locking." },
                                           { "192", "ReturningPolicy contains field, [{0}] but custom [{1}] does not output it." },
                                           { "193", "There is no custom [{0}] set, but ReturningPolicy contains field(s) to be returned and [{1}] does not support generating call with returning." },
                                           { "194", "The class extraction method [{0}], must be a static method on the descriptor''s class." },
                                           { "195", "The shared class {1} must not reference the isolated class {0}." },
                                           { "196", "UpdateAllFields has not been set or has been set to false.  When using CMPPolicy.setForceUpdate(true) you must also call CMPPolicy.setUpdateAllFields(true)" },
                                           { "197", "The mapping [{0}] is not the appropriate type for this descriptor" },
                                           { "198", "In order to use ObjectChangeTrackingPolicy or AttributeChangeTrackingPolicy, {0} has to implement ChangeTracker interface." },
                                           { "199", "In order to use Fetch Group, the domain class ({0}) has to implement FetchGroupTracker interface." },
                                           { "200", "Attempt to register an object with dead indirection as a new object.  Possibly the object was deleted or removed from the cache during a merge of a serialized clone.  This is a concurrency violation, consider a locking strategy." },
                                           { "201", "An object was attempted to be built in the session cache, but the descriptor is marked as isolated in the unit of work, so should never be accessed outside of a unit of work." },
                                           { "202", "An internal error occurred accessing the primary key object [{0}]." },
                                           { "203", "An internal error occurred while accessing method [{1}] on class [{0}]." },
                                           { "204", "Insert table order contradicts to multiple tables foreign keys - according to the latter table [{0}] shouild be inserted before table [{1}]." },
                                           { "205", "Insert table order has cyclical dependency between tables [{0}] and [{1}]." },
                                           { "206", "Insert table order has cyclical dependency between three or more tables." },
                                           { "207", "Insert table order is wrong: table [{0}] mapped to parent is specified to be inserted after table [{1}] mapped to child." },
                                           { "208", "You are trying to set a Converter with class name [{1}] on a non-direct-mapping [{0}].  Only Direct Mappings are allowed to have converters.  This usually happens when trying to set a key converter on a DirectMapMapping with a non-direct key." },
                                           { "209", "This descriptor contains a mapping with a DirectMapMapping and no key field set." },
                                           { "210", "[{0}] has list order field set, but attribute does not implement List." },
                                           { "211", "[{0}] has list order field set and list order field validation mode is CORRECTION, that requires IndirectList to be assignable to the attribute." },
                                           { "212", "List order field specified for [{0}] has a wrong table [{1}]. Must use {2} instead." },
                                           { "213", "{0} requires all target foreign key fields to belong to the same table, but several were found: {1}." },
                                           { "214", "{0} specifies relation table, that is not compatible with addForeignKey(Name) method, or use addSourceRelationKeyField(Name) and addTargetRelationKeyFieldName methods instead."},
                                           { "215", "{0} must have non-null RelationTableMechanism."},
                                           { "216", "CacheKeyType cannot be ID_VALUE for a composite primary key.."},
                                           { "217", "Invalid XPath for XMLDirectMapping/XMLCompositeDirectCollectionMapping. XPath must either contain an @ symbol for attributes or end in /text() for text nodes. For example: \"@name\" or \"name/text()\""}, 
                                           // 323148
                                           { "218", "A NullPointerException would have occurred accessing a non-existent weaved _vh_ method [{0}].  The class was not weaved properly - for EE deployments, check the module order in the application.xml deployment descriptor and verify that the module containing the persistence unit is ahead of any other module that uses it."},
                                           { "219", "The additional criteria from [{1}] is not allowed within an inheritance hierarchy using views."},
                                           { "220", "Missing partitioning policy for name [{0}]."},
                                           { "221", "SerializedObjectPolicy field is not set."},
                                           { "222", "An exception was thrown when trying to get a primary key class instance."}

    };

    /**
     * Return the lookup table.
     */
    protected Object[][] getContents() {
        return contents;
    }
}
