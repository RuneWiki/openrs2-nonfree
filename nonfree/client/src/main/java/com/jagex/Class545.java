package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public class Class545 {

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "[Lclient!sv;")
	Class544[] aClass544Array1;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	int anInt5213;

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
	int anInt5214;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	int anInt5215;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sw", name = "this$0", descriptor = "Lclient!sb;")
	final Class528 this$0;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!sb;)V", line = 207)
	Class545(@OriginalArg(0) Class528 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "(III)V", line = 210)
	void method30959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass544Array1 != null && this.anInt5213 * -806913965 == arg1 && arg0 == this.anInt5214 * -764843529) {
			return;
		}
		this.anInt5214 = arg0 * -68802617;
		this.anInt5215 = ((0x1 << arg0) - 1) * 133366357;
		this.anInt5213 = arg1 * 769493979;
		@Pc(46) int local46 = 0x1 << this.anInt5213 * -806913965 + this.anInt5214 * -764843529;
		this.aClass544Array1 = new Class544[local46];
		for (@Pc(52) int local52 = 0; local52 < local46; local52++) {
			this.aClass544Array1[local52] = new Class544(this);
		}
	}

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "()V", line = 220)
	void method30960() {
		@Pc(11) int local11 = 0x1 << this.anInt5213 * -806913965 + this.anInt5214 * -764843529;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30951();
		}
	}

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "()V", line = 220)
	void method30961() {
		@Pc(11) int local11 = 0x1 << this.anInt5213 * -806913965 + this.anInt5214 * -764843529;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30951();
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V", line = 220)
	void method30962() {
		@Pc(11) int local11 = 0x1 << this.anInt5213 * -806913965 + this.anInt5214 * -764843529;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30951();
		}
	}

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "(IB)Lclient!sv;", line = 225)
	Class544 method30963(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass544Array1[((arg0 & this.anInt5215 * 417458941) << this.anInt5213 * -806913965) + ((arg1 & 0xFF) >>> 8 - this.anInt5213 * -806913965)];
	}

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "(IBB)Lclient!sv;", line = 225)
	Class544 method30964(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass544Array1[((arg0 & this.anInt5215 * 417458941) << this.anInt5213 * -806913965) + ((arg1 & 0xFF) >>> 8 - this.anInt5213 * -806913965)];
	}

	@OriginalMember(owner = "client!sw", name = "eo", descriptor = "(IIIII)V", line = 858)
	static void method30965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) Class136_Sub1.anInt1677 / (float) Class136_Sub1.anInt1676;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class88.anInt610 = local34 * Class136_Sub1.anInt1676 / local7 * 704227181;
		Class349.anInt4496 = (Class136_Sub1.anInt1677 - Class136_Sub1.anInt1677 * local42 / local9) * 980626489;
		Class136_Sub1.anInt1703 = 1421361991;
		Class136_Sub1.anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!sw", name = "ce", descriptor = "(Lclient!yf;B)V", line = 5010)
	static final void method30966(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class529.method30720(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!sw", name = "lp", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6591)
	static final void method30967(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray16 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!sw", name = "zo", descriptor = "(Lclient!yf;B)V", line = 9086)
	static final void method30968(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 < client.anInt3529 * -1979292205) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass162Array1[local12].aBoolean557 ? 1 : 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!sw", name = "aem", descriptor = "(Lclient!yf;I)V", line = 9965)
	static final void method30969(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) int local25 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] - 1;
		@Pc(31) Class18 local31 = (Class18) Class537.aClass35_Sub7_1.method18319(local13);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local31.method388(local25);
	}
}
