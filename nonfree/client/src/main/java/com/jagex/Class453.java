package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public class Class453 implements Interface50 {

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	static int anInt5057;

	@OriginalMember(owner = "client!sf", name = "fs", descriptor = "Lclient!ny;")
	public static Class359 aClass359_77;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	final int anInt5055;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	final int anInt5056;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(II)V", line = 12)
	Class453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5055 = arg0 * 817649749;
		this.anInt5056 = arg1 * -1487986835;
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 18)
	@Override
	public boolean method28752(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface46 local12 = arg1[local1];
			if (local12 != null && local12.method11582() == this.anInt5055 * -1888623363 && local12.method11584() == this.anInt5056 * 349749861) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;I)Z", line = 18)
	@Override
	public boolean method28750(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface46 local12 = arg1[local1];
			if (local12 != null && local12.method11582() == this.anInt5055 * -1888623363 && local12.method11584() == this.anInt5056 * 349749861) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 18)
	@Override
	public boolean method28753(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface46 local12 = arg1[local1];
			if (local12 != null && local12.method11582() == this.anInt5055 * -1888623363 && local12.method11584() == this.anInt5056 * 349749861) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 18)
	@Override
	public boolean method28751(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface46 local12 = arg1[local1];
			if (local12 != null && local12.method11582() == this.anInt5055 * -1888623363 && local12.method11584() == this.anInt5056 * 349749861) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "(Lclient!ahb;)Lclient!sf;", line = 27)
	static Class453 method28434(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(7) int local7 = arg0.method20269();
		return new Class453(local3, local7);
	}

	@OriginalMember(owner = "client!sf", name = "cg", descriptor = "(Lclient!vs;I)V", line = 4441)
	static final void method28435(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class315.method25831(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "is", descriptor = "(B)V", line = 5308)
	static final void method28436() {
		@Pc(2) Iterator local2 = client.aClass581_18.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class3_Sub1_Sub16 local9 = (Class3_Sub1_Sub16) local2.next();
			@Pc(12) Class26_Sub1_Sub1_Sub4 local12 = local9.aClass26_Sub1_Sub1_Sub4_1;
			local12.method20604(1);
			if (local12.method20602()) {
				local9.method33656();
				local12.method20597();
			}
		}
	}
}
