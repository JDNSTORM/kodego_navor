package activity_01_a

import java.time.LocalDateTime
import java.time.Month
import java.util.Date

/*
    You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.

    List down all data that can be used to implement this. Use the proper data types.
 */

fun main() {
    // Student Information
    var courseName: String
    var batchNumber: String
    var firstName: String
    var lastName: String
    var gender: String
    var birthDate: Date
    var age: Int

    // Attendance Records
    var classDate: String
    var attendance: String

    // Activity Records
    var employmentApplicationFormSubmitted = false
    var employmentApplicationFormSubmittedDate: Date?
    var employmentApplicationFormDueDate: Date?
    var employmentApplicationFormScore: Int?
    var employmentApplicationFormRemarks: String?

    var activity_01_aSubmitted = false
    var activity_01_aSubmittedDate: Date?
    var activity_01_aDueDate: Date?
    var activity_01_aScore: Int?
    var activity_01_aRemarks: String?

    var activity_01_bSubmitted = false
    var activity_01_bSubmittedDate: Date?
    var activity_01_bDueDate: Date?
    var activity_01_bScore: Int?
    var activity_01_bRemarks: String?

    var activity_01_cSubmitted = false
    var activity_01_cSubmittedDate: Date?
    var activity_01_cDueDate: Date?
    var activity_01_cScore: Int?
    var activity_01_cRemarks: String?

    var activity_01_dSubmitted = false
    var activity_01_dSubmittedDate: Date?
    var activity_01_dDueDate: Date?
    var activity_01_dScore: Int?
    var activity_01_dRemarks: String?

}