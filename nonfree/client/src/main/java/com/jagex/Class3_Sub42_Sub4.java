package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ans")
public class Class3_Sub42_Sub4 extends Class3_Sub42 {

	@OriginalMember(owner = "client!ans", name = "x", descriptor = "I")
	final int anInt2798;

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(III)V", line = 12)
	public Class3_Sub42_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt2798 = arg2 * -830401481;
	}

	@OriginalMember(owner = "client!ans", name = "g", descriptor = "()Z", line = 17)
	@Override
	public boolean method20198() {
		@Pc(6) Class26_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[this.anInt2798 * 287760775];
		if (local6 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_17, this.anInt2796 * 1705574607, -1, local6, this.anInt2798 * 287760775);
			return true;
		}
	}

	@OriginalMember(owner = "client!ans", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method20199() {
		@Pc(6) Class26_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[this.anInt2798 * 287760775];
		if (local6 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_17, this.anInt2796 * 1705574607, -1, local6, this.anInt2798 * 287760775);
			return true;
		}
	}

	@OriginalMember(owner = "client!ans", name = "a", descriptor = "()Z", line = 17)
	@Override
	public boolean method20197() {
		@Pc(6) Class26_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[this.anInt2798 * 287760775];
		if (local6 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_17, this.anInt2796 * 1705574607, -1, local6, this.anInt2798 * 287760775);
			return true;
		}
	}

	@OriginalMember(owner = "client!ans", name = "l", descriptor = "()Z", line = 17)
	@Override
	public boolean method20196() {
		@Pc(6) Class26_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[this.anInt2798 * 287760775];
		if (local6 == null) {
			return false;
		} else {
			Class449.method28378(Class634.aClass634_17, this.anInt2796 * 1705574607, -1, local6, this.anInt2798 * 287760775);
			return true;
		}
	}
}
