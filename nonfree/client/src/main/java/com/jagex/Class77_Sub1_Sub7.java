package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqm")
public class Class77_Sub1_Sub7 extends Class77_Sub1 {

	@OriginalMember(owner = "client!aqm", name = "e", descriptor = "Ljava/lang/String;")
	String aString94;

	@OriginalMember(owner = "client!aqm", name = "t", descriptor = "Ljava/lang/String;")
	final String aString93;

	@OriginalMember(owner = "client!aqm", name = "q", descriptor = "Ljava/lang/String;")
	final String aString92;

	@OriginalMember(owner = "client!aqm", name = "d", descriptor = "I")
	final int anInt2984;

	@OriginalMember(owner = "client!aqm", name = "u", descriptor = "I")
	int anInt2987;

	@OriginalMember(owner = "client!aqm", name = "s", descriptor = "I")
	final int anInt2983;

	@OriginalMember(owner = "client!aqm", name = "r", descriptor = "J")
	final long aLong149;

	@OriginalMember(owner = "client!aqm", name = "g", descriptor = "I")
	final int anInt2985;

	@OriginalMember(owner = "client!aqm", name = "x", descriptor = "I")
	final int anInt2986;

	@OriginalMember(owner = "client!aqm", name = "z", descriptor = "Z")
	final boolean aBoolean490;

	@OriginalMember(owner = "client!aqm", name = "j", descriptor = "Z")
	final boolean aBoolean489;

	@OriginalMember(owner = "client!aqm", name = "i", descriptor = "J")
	final long aLong150;

	@OriginalMember(owner = "client!aqm", name = "k", descriptor = "Z")
	final boolean aBoolean491;

	@OriginalMember(owner = "client!aqm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 2017)
	Class77_Sub1_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aString93 = arg1;
		this.aString92 = arg0;
		this.anInt2984 = arg2 * -1012672397;
		this.anInt2987 = arg3 * -390549453;
		this.anInt2983 = arg4 * 420679787;
		this.aLong149 = arg5 * 4198517094207527929L;
		this.anInt2985 = arg6 * -172997041;
		this.anInt2986 = arg7 * -533383379;
		this.aBoolean490 = arg8;
		this.aBoolean489 = arg9;
		this.aLong150 = arg10 * 7996350968569255069L;
		this.aBoolean491 = arg11;
	}

	@OriginalMember(owner = "client!aqm", name = "p", descriptor = "(B)J", line = 2033)
	public long method21627() {
		return this.aLong149 * -7225575275964615095L;
	}

	@OriginalMember(owner = "client!aqm", name = "v", descriptor = "()J", line = 2033)
	public long method21628() {
		return this.aLong149 * -7225575275964615095L;
	}

	@OriginalMember(owner = "client!aqm", name = "l", descriptor = "()J", line = 2037)
	public long method21629() {
		return this.aLong150 * -6387465159951953483L;
	}

	@OriginalMember(owner = "client!aqm", name = "c", descriptor = "(B)J", line = 2037)
	public long method21630() {
		return this.aLong150 * -6387465159951953483L;
	}
}
