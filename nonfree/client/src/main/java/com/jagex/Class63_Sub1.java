package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahu")
public class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!ahu", name = "u", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!ahu", name = "z", descriptor = "I")
	int anInt1519;

	@OriginalMember(owner = "client!ahu", name = "b", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!ahu", name = "y", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!ahu", name = "j", descriptor = "Ljava/lang/String;")
	String aString53;

	@OriginalMember(owner = "client!ahu", name = "c", descriptor = "I")
	public int anInt1520 = -100880291;

	@OriginalMember(owner = "client!ahu", name = "<init>", descriptor = "()V", line = 11)
	Class63_Sub1() {
	}

	@OriginalMember(owner = "client!ahu", name = "n", descriptor = "(I)Lclient!ta;", line = 14)
	Class473 method13054() {
		return Class116.aClass473Array1[this.anInt1511 * 1149641177];
	}

	@OriginalMember(owner = "client!ahu", name = "q", descriptor = "()Lclient!ta;", line = 14)
	Class473 method13055() {
		return Class116.aClass473Array1[this.anInt1511 * 1149641177];
	}

	@OriginalMember(owner = "client!ahu", name = "d", descriptor = "()Lclient!ta;", line = 14)
	Class473 method13056() {
		return Class116.aClass473Array1[this.anInt1511 * 1149641177];
	}

	@OriginalMember(owner = "client!ahu", name = "e", descriptor = "(B)I", line = 18)
	public int method13057() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().anInt5120 * 1302003197 : this.anInt1519 * 99041385;
	}

	@OriginalMember(owner = "client!ahu", name = "m", descriptor = "()I", line = 18)
	public int method13058() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().anInt5120 * 1302003197 : this.anInt1519 * 99041385;
	}

	@OriginalMember(owner = "client!ahu", name = "v", descriptor = "()I", line = 18)
	public int method13059() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().anInt5120 * 1302003197 : this.anInt1519 * 99041385;
	}

	@OriginalMember(owner = "client!ahu", name = "r", descriptor = "(B)Ljava/lang/String;", line = 23)
	public String method13053() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().aString227 : this.aString53;
	}

	@OriginalMember(owner = "client!ahu", name = "t", descriptor = "()Ljava/lang/String;", line = 23)
	public String method13060() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().aString227 : this.aString53;
	}

	@OriginalMember(owner = "client!ahu", name = "w", descriptor = "()Ljava/lang/String;", line = 23)
	public String method13061() {
		return this.anInt1519 * 99041385 == 0 ? this.method13054().aString227 : this.aString53;
	}

	@OriginalMember(owner = "client!ahu", name = "fm", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4964)
	static final void method13062(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		arg0.anInt3554 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * -63808433;
		arg0.anInt3505 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * 819429091;
		Class223.method24442(arg0);
		if (arg0.anInt3492 * -107621169 == 0) {
			Class109.method21948(arg1, arg0, false);
		}
	}

	@OriginalMember(owner = "client!ahu", name = "tt", descriptor = "(Lclient!vs;I)V", line = 7717)
	static final void method13063(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class510.aClass183_1.method23570(local13, local23);
	}
}
