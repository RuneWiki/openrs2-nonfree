package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ox")
public class Class456 implements Interface4 {

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_121;

	@OriginalMember(owner = "client!ox", name = "c", descriptor = "Ljava/lang/String;")
	final String aString213;

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(Lclient!pw;Ljava/lang/String;)V", line = 11)
	Class456(@OriginalArg(0) Class478 arg0, @OriginalArg(1) String arg1) {
		this.aClass478_121 = arg0;
		this.aString213 = arg1;
	}

	@OriginalMember(owner = "client!ox", name = "v", descriptor = "()I", line = 17)
	@Override
	public int method29472() {
		return this.aClass478_121.method29783(this.aString213) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "(I)I", line = 17)
	@Override
	public int method29477() {
		return this.aClass478_121.method29783(this.aString213) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ox", name = "y", descriptor = "()I", line = 17)
	@Override
	public int method29474() {
		return this.aClass478_121.method29783(this.aString213) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "()I", line = 17)
	@Override
	public int method29473() {
		return this.aClass478_121.method29783(this.aString213) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ox", name = "x", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29478() {
		return Class29.aClass29_1;
	}

	@OriginalMember(owner = "client!ox", name = "c", descriptor = "(I)Lclient!abc;", line = 22)
	@Override
	public Class29 method29471() {
		return Class29.aClass29_1;
	}

	@OriginalMember(owner = "client!ox", name = "t", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29470() {
		return Class29.aClass29_1;
	}

	@OriginalMember(owner = "client!ox", name = "q", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29475() {
		return Class29.aClass29_1;
	}

	@OriginalMember(owner = "client!ox", name = "w", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29476() {
		return Class29.aClass29_1;
	}

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "(IJ)Lclient!aqh;", line = 47)
	static Class77_Sub1_Sub6 method29469(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Class77_Sub1_Sub6.aBoolean488 = false;
		@Pc(11) Class77_Sub1_Sub6 local11 = (Class77_Sub1_Sub6) Class77_Sub1_Sub6.aClass12_17.method173((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class77_Sub1_Sub6(arg0, arg1);
			Class77_Sub1_Sub6.aClass12_17.method184(local11, local11.aLong229 * 8258869577519436579L);
			Class77_Sub1_Sub6.aBoolean488 = true;
		}
		return local11;
	}
}
