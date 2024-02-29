package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apq")
public class Class96_Sub11_Sub2 extends Class96_Sub11 {

	@OriginalMember(owner = "client!apq", name = "y", descriptor = "I")
	final int anInt2771;

	@OriginalMember(owner = "client!apq", name = "w", descriptor = "I")
	final int anInt2770;

	@OriginalMember(owner = "client!apq", name = "t", descriptor = "I")
	final int anInt2772;

	@OriginalMember(owner = "client!apq", name = "<init>", descriptor = "(Lclient!akv;)V", line = 14)
	Class96_Sub11_Sub2(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.method22500();
		this.anInt2771 = (local6 >>> 16) * 207373019;
		this.anInt2770 = (local6 & 0xFFFF) * -330398523;
		this.anInt2772 = arg0.method22478() * -876474977;
	}

	@OriginalMember(owner = "client!apq", name = "w", descriptor = "()V", line = 22)
	@Override
	public void method19913() {
		@Pc(6) int local6 = this.anInt2771 * -1882020352 + 256;
		@Pc(13) int local13 = this.anInt2770 * -1129047552 + 256;
		@Pc(18) int local18 = this.anInt2772 * -392573345;
		if (local18 < 3 && client.aClass517_1.method30441().method29665(this.anInt2771 * 935848275, this.anInt2770 * 1633573389)) {
			local18++;
		}
		@Pc(90) Class104_Sub1_Sub1_Sub5 local90 = new Class104_Sub1_Sub1_Sub5(client.aClass517_1.method30435(), this.anInt2769 * 1538714989, 0, this.anInt2772 * -392573345, local18, local6, Class277.method26658(local6, local13, this.anInt2772 * -392573345) - this.anInt2768 * 290996515, local13, this.anInt2771 * 935848275, this.anInt2771 * 935848275, this.anInt2770 * 1633573389, this.anInt2770 * 1633573389, this.anInt2767 * 1055910679, false, 0);
		client.aClass12_21.method184(new Class77_Sub1_Sub5(local90), (long) (this.anInt2771 * 935848275 << 16 | this.anInt2770 * 1633573389));
	}

	@OriginalMember(owner = "client!apq", name = "y", descriptor = "()V", line = 22)
	@Override
	public void method19912() {
		@Pc(6) int local6 = this.anInt2771 * -1882020352 + 256;
		@Pc(13) int local13 = this.anInt2770 * -1129047552 + 256;
		@Pc(18) int local18 = this.anInt2772 * -392573345;
		if (local18 < 3 && client.aClass517_1.method30441().method29665(this.anInt2771 * 935848275, this.anInt2770 * 1633573389)) {
			local18++;
		}
		@Pc(90) Class104_Sub1_Sub1_Sub5 local90 = new Class104_Sub1_Sub1_Sub5(client.aClass517_1.method30435(), this.anInt2769 * 1538714989, 0, this.anInt2772 * -392573345, local18, local6, Class277.method26658(local6, local13, this.anInt2772 * -392573345) - this.anInt2768 * 290996515, local13, this.anInt2771 * 935848275, this.anInt2771 * 935848275, this.anInt2770 * 1633573389, this.anInt2770 * 1633573389, this.anInt2767 * 1055910679, false, 0);
		client.aClass12_21.method184(new Class77_Sub1_Sub5(local90), (long) (this.anInt2771 * 935848275 << 16 | this.anInt2770 * 1633573389));
	}

	@OriginalMember(owner = "client!apq", name = "c", descriptor = "(I)V", line = 22)
	@Override
	public void method19911() {
		@Pc(6) int local6 = this.anInt2771 * -1882020352 + 256;
		@Pc(13) int local13 = this.anInt2770 * -1129047552 + 256;
		@Pc(18) int local18 = this.anInt2772 * -392573345;
		if (local18 < 3 && client.aClass517_1.method30441().method29665(this.anInt2771 * 935848275, this.anInt2770 * 1633573389)) {
			local18++;
		}
		@Pc(90) Class104_Sub1_Sub1_Sub5 local90 = new Class104_Sub1_Sub1_Sub5(client.aClass517_1.method30435(), this.anInt2769 * 1538714989, 0, this.anInt2772 * -392573345, local18, local6, Class277.method26658(local6, local13, this.anInt2772 * -392573345) - this.anInt2768 * 290996515, local13, this.anInt2771 * 935848275, this.anInt2771 * 935848275, this.anInt2770 * 1633573389, this.anInt2770 * 1633573389, this.anInt2767 * 1055910679, false, 0);
		client.aClass12_21.method184(new Class77_Sub1_Sub5(local90), (long) (this.anInt2771 * 935848275 << 16 | this.anInt2770 * 1633573389));
	}
}
