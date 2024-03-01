package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vz")
public class Class543 {

	@OriginalMember(owner = "client!vz", name = "p", descriptor = "Lclient!vz;")
	public static final Class543 aClass543_4 = new Class543("runescape", "RuneScape", 0, Class623.aClass623_5);

	@OriginalMember(owner = "client!vz", name = "a", descriptor = "Lclient!vz;")
	public static final Class543 aClass543_5 = new Class543("stellardawn", "Stellar Dawn", 1, Class623.aClass623_2);

	@OriginalMember(owner = "client!vz", name = "g", descriptor = "Lclient!vz;")
	static final Class543 aClass543_6 = new Class543("game3", "Game 3", 2, Class623.aClass623_5);

	@OriginalMember(owner = "client!vz", name = "l", descriptor = "Lclient!vz;")
	static final Class543 aClass543_9 = new Class543("game4", "Game 4", 3, Class623.aClass623_7);

	@OriginalMember(owner = "client!vz", name = "h", descriptor = "Lclient!vz;")
	static final Class543 aClass543_8 = new Class543("game5", "Game 5", 4, Class623.aClass623_8);

	@OriginalMember(owner = "client!vz", name = "x", descriptor = "Lclient!vz;")
	static final Class543 aClass543_7 = new Class543("oldscape", "RuneScape 2007", 5, Class623.aClass623_5);

	@OriginalMember(owner = "client!vz", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString236;

	@OriginalMember(owner = "client!vz", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString237;

	@OriginalMember(owner = "client!vz", name = "y", descriptor = "I")
	public final int anInt5326;

	@OriginalMember(owner = "client!vz", name = "g", descriptor = "()[Lclient!vz;", line = 18)
	static Class543[] method32595() {
		return new Class543[] { aClass543_4, aClass543_7, aClass543_6, aClass543_9, aClass543_5, aClass543_8 };
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILclient!zm;)V", line = 21)
	Class543(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class623 arg3) {
		this.aString236 = arg0;
		this.aString237 = arg1;
		this.anInt5326 = arg2 * -837775801;
	}

	@OriginalMember(owner = "client!vz", name = "l", descriptor = "(I)Lclient!vz;", line = 29)
	public static Class543 method32596(@OriginalArg(0) int arg0) {
		@Pc(2) Class543[] local2 = Class529.method32459();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class543 local12 = local2[local4];
			if (local12.anInt5326 * 1050721143 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vz", name = "h", descriptor = "(I)Lclient!vz;", line = 29)
	public static Class543 method32597(@OriginalArg(0) int arg0) {
		@Pc(2) Class543[] local2 = Class529.method32459();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class543 local12 = local2[local4];
			if (local12.anInt5326 * 1050721143 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vz", name = "tm", descriptor = "(Lclient!vs;B)V", line = 7520)
	static final void method32599(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(37) Class178 local37 = Class375.method27235(local33);
		Class163.method23297(local37, local13, local23);
	}

	@OriginalMember(owner = "client!vz", name = "aoh", descriptor = "(Lclient!vs;I)V", line = 11631)
	static final void method32598(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub33_1.method14179();
	}
}
