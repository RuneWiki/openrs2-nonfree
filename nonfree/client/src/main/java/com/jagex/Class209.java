package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public class Class209 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	int anInt3591;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "[Lclient!dy;")
	Class215[] aClass215Array1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!pw;)V", line = 10)
	public Class209(@OriginalArg(0) Class478 arg0) {
		this.anInt3591 = arg0.method29752(0) * 1447972299;
		this.aClass215Array1 = new Class215[this.anInt3591 * -1815973917];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3591 * -1815973917; local18++) {
			@Pc(33) Class77_Sub39 local33 = new Class77_Sub39(arg0.method29725(0, local18));
			if (local33.aByteArray53 == null) {
				this.aClass215Array1[local18] = null;
			} else {
				try {
					@Pc(46) Class215 local46 = new Class215();
					local46.method25647(local18, local33);
					this.aClass215Array1[local18] = local46;
				} catch (@Pc(58) Exception local58) {
					this.aClass215Array1[local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "(I)[Lclient!cm;", line = 19)
	static Class192[] method25582() {
		return new Class192[] { Class192.aClass192_6, Class192.aClass192_5, Class192.aClass192_3, Class192.aClass192_2, Class192.aClass192_4, Class192.aClass192_7, Class192.aClass192_1 };
	}

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "(I)Lclient!dy;", line = 30)
	public Class215 method25583(@OriginalArg(0) int arg0) {
		return this.aClass215Array1[arg0];
	}

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "(IB)Lclient!dy;", line = 30)
	public Class215 method25584(@OriginalArg(0) int arg0) {
		return this.aClass215Array1[arg0];
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)Lclient!dy;", line = 30)
	public Class215 method25585(@OriginalArg(0) int arg0) {
		return this.aClass215Array1[arg0];
	}

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "(S)V", line = 147)
	public static void method25586() {
		@Pc(2) Class232 local2 = Class412.aClass232_81;
		synchronized (Class412.aClass232_81) {
			Class412.aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!dp", name = "afb", descriptor = "(Lclient!yf;I)V", line = 10063)
	static final void method25587(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local12)).anInt3767 * 858677227;
	}

	@OriginalMember(owner = "client!dp", name = "ayw", descriptor = "(Lclient!yf;B)V", line = 13659)
	static final void method25588(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class508.aString221.startsWith("linux") ? 1 : 0;
	}

	@OriginalMember(owner = "client!dp", name = "azf", descriptor = "(Lclient!yf;I)V", line = 13706)
	static final void method25589(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local12).anInt3825 * 279279007;
	}
}
