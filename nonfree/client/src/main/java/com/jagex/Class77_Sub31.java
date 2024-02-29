package com.jagex;

import java.io.EOFException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akh")
public class Class77_Sub31 extends Class77 {

	@OriginalMember(owner = "client!akh", name = "l", descriptor = "J")
	public long aLong90;

	@OriginalMember(owner = "client!akh", name = "<init>", descriptor = "(J)V", line = 6)
	public Class77_Sub31(@OriginalArg(0) long arg0) {
		this.aLong90 = arg0 * 1934962372971061735L;
	}

	@OriginalMember(owner = "client!akh", name = "y", descriptor = "(B)Lclient!f;", line = 69)
	public static Class240 method13784() {
		@Pc(1) Class28 local1 = null;
		@Pc(65) Class240 local65;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method478()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method486(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class240 local50 = new Class240(new Class77_Sub39(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class240();
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}
}
