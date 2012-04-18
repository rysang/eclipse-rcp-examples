package de.baeckerit.jdk.util;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ErrorLogger {

  public static ILogErrors errorLogger = null;

  public static void logInfo(Class<?> clazz, String message) {
    if (errorLogger != null) {
      errorLogger.logInfo(clazz, message);
    } else {
      Logger logger = Logger.getLogger(clazz.getName());
      logger.log(Level.INFO, message);
    }
  }

  public static void logWarn(Class<?> clazz, String message) {
    if (errorLogger != null) {
      errorLogger.logWarn(clazz, message);
    } else {
      Logger logger = Logger.getLogger(clazz.getName());
      logger.log(Level.WARNING, message);
    }
  }

  public static void logError(Class<?> clazz, String message) {
    if (errorLogger != null) {
      errorLogger.logError(clazz, message);
    } else {
      Logger logger = Logger.getLogger(clazz.getName());
      logger.log(Level.SEVERE, message);
    }
  }

  public static void logError(Class<?> clazz, String message, Throwable t) {
    if (errorLogger != null) {
      errorLogger.logError(clazz, message, t);
    } else {
      Logger logger = Logger.getLogger(clazz.getName());
      logger.log(Level.SEVERE, message, t);
    }
  }

  public static void logListener(Class<?> clazz, Throwable t) {
    logError(clazz, "Exception in listener", t);
  }
}
