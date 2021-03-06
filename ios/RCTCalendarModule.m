//
//  RCTCalendarModule.m
//  useNativeModeule
//
//  Created by giuseppe varas on 02-03-21.
//

#import <Foundation/Foundation.h>
#import <React/RCTLog.h>

// RCTCalendarModule.m
#import "RCTCalendarModule.h"

@implementation RCTCalendarModule

// To export a module named RCTCalendarModule
RCT_EXPORT_MODULE();

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

- ( NSDictionary * ) constantsToExport
{
  return @ { @ "DEFAULT_EVENT_NAME" : @ "Nuevo evento", @ "OTRA": @"OTRO_VALOR"} ;
}

RCT_EXPORT_METHOD(createCalendarEvent:(NSString *)name location:(NSString *)location)
{
 RCTLogInfo(@"Pretending to create an event %@ at %@", name, location);
}

@end
