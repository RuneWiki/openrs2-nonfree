package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public class Class557 {

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "J")
	public static long aLong285;

	@OriginalMember(owner = "client!wo", name = "ge", descriptor = "Lclient!ny;")
	public static Class359 aClass359_98;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "Lclient!wo;")
	public static final Class557 aClass557_5 = new Class557("LIVE", 0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "Lclient!wo;")
	public static final Class557 aClass557_6 = new Class557("BUILDLIVE", 3);

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!wo;")
	public static final Class557 aClass557_4 = new Class557("RC", 1);

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!wo;")
	public static final Class557 aClass557_3 = new Class557("WIP", 2);

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!wo;")
	static final Class557 aClass557_2 = new Class557("INTBETA", 4);

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString238;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
	public final int anInt5335;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "()[Lclient!wo;", line = 14)
	static Class557[] method32811() {
		return new Class557[] { aClass557_4, aClass557_5, aClass557_6, aClass557_3, aClass557_2 };
	}

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "()[Lclient!wo;", line = 14)
	static Class557[] method32812() {
		return new Class557[] { aClass557_4, aClass557_5, aClass557_6, aClass557_3, aClass557_2 };
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 17)
	Class557(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString238 = arg0;
		this.anInt5335 = arg1 * -1851826409;
	}

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "(I)Lclient!wo;", line = 24)
	public static Class557 method32810(@OriginalArg(0) int arg0) {
		@Pc(2) Class557[] local2 = Class213.method24266();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class557 local12 = local2[local4];
			if (local12.anInt5335 * -426129241 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)Lclient!wo;", line = 24)
	public static Class557 method32813(@OriginalArg(0) int arg0) {
		@Pc(2) Class557[] local2 = Class213.method24266();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class557 local12 = local2[local4];
			if (local12.anInt5335 * -426129241 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "(I)Lclient!wo;", line = 24)
	public static Class557 method32814(@OriginalArg(0) int arg0) {
		@Pc(2) Class557[] local2 = Class213.method24266();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class557 local12 = local2[local4];
			if (local12.anInt5335 * -426129241 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "da", descriptor = "(I)Lclient!amh;", line = 712)
	public static Class3_Sub1_Sub4 method32815() {
		return Class58_Sub1.aClass3_Sub1_Sub4_2;
	}
}
