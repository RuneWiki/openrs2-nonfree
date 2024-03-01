package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ana")
public class Class166_Sub27 extends Class166 {

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "I")
	static final int anInt2242 = 0;

	@OriginalMember(owner = "client!ana", name = "w", descriptor = "I")
	static final int anInt2243 = 4;

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub27(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ana", name = "o", descriptor = "(I)V", line = 19)
	public void method15931() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "y", descriptor = "()V", line = 19)
	public void method15933() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "x", descriptor = "()V", line = 19)
	public void method15936() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "q", descriptor = "()V", line = 19)
	public void method15937() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16541() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16547() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16548() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16542() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "s", descriptor = "(S)I", line = 35)
	public int method15932() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "h", descriptor = "()I", line = 35)
	public int method15934() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "b", descriptor = "()I", line = 35)
	public int method15935() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "g", descriptor = "(II)V", line = 157)
	public static void method15938(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(21, (long) arg0);
		local4.method21865();
	}

	@OriginalMember(owner = "client!ana", name = "ep", descriptor = "(Lclient!yf;B)V", line = 5746)
	static final void method15940(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class275.method26342(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ana", name = "awl", descriptor = "(Lclient!yf;I)V", line = 13613)
	static final void method15939(@OriginalArg(0) Class681 arg0) {
		if (client.anInt3435 * -849002901 != 13 && client.anInt3435 * -849002901 != 18 || Class251.method25973()) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else if (Class50.aBoolean26) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else if (Class333.aLong260 * -7110566573125480355L > Class305.method26796() - 1000L) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			Class50.aBoolean26 = true;
			@Pc(76) Class175 local76 = Class330.method27372();
			@Pc(82) Class93_Sub22 local82 = Class102.method2592(Class446.aClass446_79, local76.aClass24_2);
			local82.aClass93_Sub41_Sub2_1.method22395(Class632.anInt5720 * 1926204629);
			local76.method24351(local82);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}
}
