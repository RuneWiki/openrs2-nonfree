package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acn")
public class Class13_Sub14 extends Class13 {

	@OriginalMember(owner = "client!acn", name = "g", descriptor = "I")
	static final int anInt648 = 1;

	@OriginalMember(owner = "client!acn", name = "a", descriptor = "I")
	static final int anInt657 = 0;

	@OriginalMember(owner = "client!acn", name = "d", descriptor = "I")
	static int anInt662;

	@OriginalMember(owner = "client!acn", name = "af", descriptor = "I")
	static int anInt663;

	@OriginalMember(owner = "client!acn", name = "x", descriptor = "I")
	final int anInt651;

	@OriginalMember(owner = "client!acn", name = "s", descriptor = "I")
	final int anInt652;

	@OriginalMember(owner = "client!acn", name = "h", descriptor = "I")
	final int anInt650;

	@OriginalMember(owner = "client!acn", name = "b", descriptor = "I")
	final int anInt653;

	@OriginalMember(owner = "client!acn", name = "c", descriptor = "I")
	final int anInt655;

	@OriginalMember(owner = "client!acn", name = "y", descriptor = "I")
	final int anInt654;

	@OriginalMember(owner = "client!acn", name = "l", descriptor = "I")
	final int anInt649;

	@OriginalMember(owner = "client!acn", name = "j", descriptor = "I")
	final int anInt660;

	@OriginalMember(owner = "client!acn", name = "u", descriptor = "I")
	final int anInt658;

	@OriginalMember(owner = "client!acn", name = "z", descriptor = "I")
	final int anInt656;

	@OriginalMember(owner = "client!acn", name = "n", descriptor = "I")
	final int anInt659;

	@OriginalMember(owner = "client!acn", name = "e", descriptor = "I")
	final int anInt647;

	@OriginalMember(owner = "client!acn", name = "r", descriptor = "I")
	final int anInt661;

	@OriginalMember(owner = "client!acn", name = "h", descriptor = "(Lclient!ahb;I)Lclient!kv;", line = 16)
	public static Class44 method6535(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		@Pc(15) int local15 = arg0.method20375();
		return new Class44_Sub1(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11, local15);
	}

	@OriginalMember(owner = "client!acn", name = "<init>", descriptor = "(Lclient!ahb;II)V", line = 30)
	Class13_Sub14(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(8) int local8;
		if (arg1 == 0) {
			local8 = arg0.method20275();
			this.anInt651 = (local8 >>> 16) * 803897869;
			this.anInt652 = (local8 & 0xFFFF) * -1493823007;
			this.anInt650 = 846741779;
		} else {
			this.anInt651 = -803897869;
			this.anInt652 = 1493823007;
			this.anInt650 = arg0.method20271() * -846741779;
		}
		if (arg2 == 0) {
			local8 = arg0.method20275();
			this.anInt653 = (local8 >>> 16) * -83441915;
			this.anInt655 = (local8 & 0xFFFF) * -1831085011;
			this.anInt654 = 801383881;
		} else {
			this.anInt653 = 83441915;
			this.anInt655 = 1831085011;
			this.anInt654 = arg0.method20271() * -801383881;
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt649 = arg0.method20269() * -5610233;
		} else {
			this.anInt649 = 5610233;
		}
		this.anInt660 = arg0.method20271() * 1646531291;
		this.anInt658 = arg0.method20269() * -1112943677;
		this.anInt656 = arg0.method20269() * -1054744219;
		this.anInt659 = arg0.method20273() * -414085313;
		this.anInt647 = arg0.method20271() * 486145639;
		this.anInt661 = arg0.method20269() * 511459083;
	}

	@OriginalMember(owner = "client!acn", name = "a", descriptor = "(I)V", line = 69)
	@Override
	public void method16888() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class26_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class320 local37;
		if (this.anInt651 * 770874565 >= 0) {
			local11 = this.anInt651 * -449213952 + 256;
			local18 = this.anInt652 * 65290752 + 256;
			local23 = this.anInt649 * 1616246967;
		} else {
			local33 = Class131.aClass163Array1[this.anInt650 * 1010716389].method23278();
			local37 = local33.method21431().aClass320_61;
			local11 = (int) local37.aFloat259;
			local18 = (int) local37.aFloat261;
			local23 = local33.aByte101;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt652 * 998371873 >= 0) {
			local60 = this.anInt653 * -270820864 + 256;
			local67 = this.anInt655 * -1247327744 + 256;
		} else {
			local33 = Class131.aClass163Array1[this.anInt654 * -597361785].method23278();
			local37 = local33.method21431().aClass320_61;
			local60 = (int) local37.aFloat259;
			local67 = (int) local37.aFloat261;
			if (local23 < 0) {
				local23 = local33.aByte101;
			}
		}
		@Pc(101) int local101 = this.anInt661 * 742724771 << 2;
		@Pc(155) Class26_Sub1_Sub1_Sub5 local155 = new Class26_Sub1_Sub1_Sub5(client.aClass370_1.method26950(), this.anInt660 * -252995245, local23, local23, local11, local18, this.anInt658 * 1662858475 << 2, client.anInt3034, client.anInt3034 + this.anInt659 * -1368268609, this.anInt647 * -2085339817, local101, this.anInt650 * 1010716389 + 1, this.anInt654 * -597361785 + 1, this.anInt656 * 1037723757 << 2, false, 0, 0);
		local155.method21046(local60, local67, this.anInt656 * 1037723757 << 2, client.anInt3034 + this.anInt659 * -1368268609);
		client.aClass553_44.method32702(new Class3_Sub1_Sub8(local155));
	}

	@OriginalMember(owner = "client!acn", name = "h", descriptor = "()V", line = 69)
	@Override
	public void method16896() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class26_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class320 local37;
		if (this.anInt651 * 770874565 >= 0) {
			local11 = this.anInt651 * -449213952 + 256;
			local18 = this.anInt652 * 65290752 + 256;
			local23 = this.anInt649 * 1616246967;
		} else {
			local33 = Class131.aClass163Array1[this.anInt650 * 1010716389].method23278();
			local37 = local33.method21431().aClass320_61;
			local11 = (int) local37.aFloat259;
			local18 = (int) local37.aFloat261;
			local23 = local33.aByte101;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt652 * 998371873 >= 0) {
			local60 = this.anInt653 * -270820864 + 256;
			local67 = this.anInt655 * -1247327744 + 256;
		} else {
			local33 = Class131.aClass163Array1[this.anInt654 * -597361785].method23278();
			local37 = local33.method21431().aClass320_61;
			local60 = (int) local37.aFloat259;
			local67 = (int) local37.aFloat261;
			if (local23 < 0) {
				local23 = local33.aByte101;
			}
		}
		@Pc(101) int local101 = this.anInt661 * 742724771 << 2;
		@Pc(155) Class26_Sub1_Sub1_Sub5 local155 = new Class26_Sub1_Sub1_Sub5(client.aClass370_1.method26950(), this.anInt660 * -252995245, local23, local23, local11, local18, this.anInt658 * 1662858475 << 2, client.anInt3034, client.anInt3034 + this.anInt659 * -1368268609, this.anInt647 * -2085339817, local101, this.anInt650 * 1010716389 + 1, this.anInt654 * -597361785 + 1, this.anInt656 * 1037723757 << 2, false, 0, 0);
		local155.method21046(local60, local67, this.anInt656 * 1037723757 << 2, client.anInt3034 + this.anInt659 * -1368268609);
		client.aClass553_44.method32702(new Class3_Sub1_Sub8(local155));
	}

	@OriginalMember(owner = "client!acn", name = "l", descriptor = "(I)Z", line = 99)
	@Override
	boolean method16890() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt660 * -252995245);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}

	@OriginalMember(owner = "client!acn", name = "x", descriptor = "()Z", line = 99)
	@Override
	boolean method16891() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt660 * -252995245);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}

	@OriginalMember(owner = "client!acn", name = "s", descriptor = "()Z", line = 99)
	@Override
	boolean method16893() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt660 * -252995245);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}
}
