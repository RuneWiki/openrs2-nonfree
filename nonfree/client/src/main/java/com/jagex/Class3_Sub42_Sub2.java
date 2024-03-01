package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anj")
public class Class3_Sub42_Sub2 extends Class3_Sub42 {

	@OriginalMember(owner = "client!anj", name = "x", descriptor = "I")
	final int anInt2775;

	@OriginalMember(owner = "client!anj", name = "<init>", descriptor = "(III)V", line = 13)
	public Class3_Sub42_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt2775 = arg2 * 2007751711;
	}

	@OriginalMember(owner = "client!anj", name = "a", descriptor = "()Z", line = 18)
	@Override
	public boolean method20197() {
		@Pc(8) Class3_Sub29 local8 = (Class3_Sub29) client.aClass581_21.method33217((long) (this.anInt2775 * 166502367));
		if (local8 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_22, this.anInt2796 * 1705574607, -1, (Class26_Sub1_Sub1_Sub1) local8.anObject2, this.anInt2775 * 166502367);
			return true;
		}
	}

	@OriginalMember(owner = "client!anj", name = "p", descriptor = "(B)Z", line = 18)
	@Override
	public boolean method20199() {
		@Pc(8) Class3_Sub29 local8 = (Class3_Sub29) client.aClass581_21.method33217((long) (this.anInt2775 * 166502367));
		if (local8 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_22, this.anInt2796 * 1705574607, -1, (Class26_Sub1_Sub1_Sub1) local8.anObject2, this.anInt2775 * 166502367);
			return true;
		}
	}

	@OriginalMember(owner = "client!anj", name = "l", descriptor = "()Z", line = 18)
	@Override
	public boolean method20196() {
		@Pc(8) Class3_Sub29 local8 = (Class3_Sub29) client.aClass581_21.method33217((long) (this.anInt2775 * 166502367));
		if (local8 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_22, this.anInt2796 * 1705574607, -1, (Class26_Sub1_Sub1_Sub1) local8.anObject2, this.anInt2775 * 166502367);
			return true;
		}
	}

	@OriginalMember(owner = "client!anj", name = "g", descriptor = "()Z", line = 18)
	@Override
	public boolean method20198() {
		@Pc(8) Class3_Sub29 local8 = (Class3_Sub29) client.aClass581_21.method33217((long) (this.anInt2775 * 166502367));
		if (local8 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_22, this.anInt2796 * 1705574607, -1, (Class26_Sub1_Sub1_Sub1) local8.anObject2, this.anInt2775 * 166502367);
			return true;
		}
	}

	@OriginalMember(owner = "client!anj", name = "u", descriptor = "(B)Lclient!ahu;", line = 108)
	public static Class63_Sub1 method20123() {
		return Class570.anInt5384 * 1908102433 < Class570.aClass63_Sub1Array2.length ? Class570.aClass63_Sub1Array2[(Class570.anInt5384 += -318345503) * 1908102433 - 1] : null;
	}
}
