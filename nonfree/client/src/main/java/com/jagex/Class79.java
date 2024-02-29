package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adg")
public class Class79 {

	@OriginalMember(owner = "client!adg", name = "<init>", descriptor = "()V", line = 6)
	Class79() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!adg", name = "c", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 11)
	public static String method1387(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class544.method30950(local16);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!adg", name = "v", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 11)
	public static String method1388(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class544.method30950(local16);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}
}
