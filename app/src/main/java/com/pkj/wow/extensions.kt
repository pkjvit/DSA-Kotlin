package com.pkj.wow


class NoConditionError(message: String = "A condition is not implemented.") : Error(message)
class NoLogicError(message: String = "A logic is not implemented.") : Error(message)


inline fun CONDITION(): Nothing = throw NoConditionError()

inline fun DO_LOGIC(): Nothing = throw NoLogicError()
