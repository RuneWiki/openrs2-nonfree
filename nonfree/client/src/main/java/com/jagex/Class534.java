package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public class Class534 {

	@OriginalMember(owner = "client!vq", name = "fk", descriptor = "Lclient!ny;")
	public static Class359 aClass359_97;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!fo;")
	Class178 aClass178_18;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!fw;")
	Class186 aClass186_4;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 10)
	Class534() {
	}

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "(B)Lclient!fo;", line = 13)
	Class178 method32511() {
		return this.aClass186_4.method23917(this.aClass178_18.anInt3570 * 954808515);
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "()Lclient!fo;", line = 13)
	Class178 method32515() {
		return this.aClass186_4.method23917(this.aClass178_18.anInt3570 * 954808515);
	}

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "()Lclient!fo;", line = 13)
	Class178 method32516() {
		return this.aClass186_4.method23917(this.aClass178_18.anInt3570 * 954808515);
	}

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "()Lclient!fo;", line = 13)
	Class178 method32517() {
		return this.aClass186_4.method23917(this.aClass178_18.anInt3570 * 954808515);
	}

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "(II)Z", line = 17)
	boolean method32512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class178 local4 = Class11_Sub2.method1219(arg0, arg1);
		if (local4 == null) {
			this.method32514();
			return false;
		} else {
			this.aClass186_4 = Class178.aClass186Array1[arg0 >> 16];
			this.aClass178_18 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z", line = 17)
	boolean method32513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class178 local4 = Class11_Sub2.method1219(arg0, arg1);
		if (local4 == null) {
			this.method32514();
			return false;
		} else {
			this.aClass186_4 = Class178.aClass186Array1[arg0 >> 16];
			this.aClass178_18 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(Lclient!fw;IIB)Z", line = 30)
	boolean method32521(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != null) {
			@Pc(6) Class178 local6 = arg0.method23917(arg1);
			if (local6 != null) {
				this.aClass186_4 = arg0;
				this.aClass178_18 = local6;
				return true;
			}
		}
		this.method32514();
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(Lclient!zz;IIB)Lclient!amj;", line = 37)
	static Class3_Sub1_Sub6 method32525(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt5592 * 88370061 | arg1 << 10;
		@Pc(16) Class3_Sub1_Sub6 local16 = (Class3_Sub1_Sub6) Class512.aClass153_1.method23146((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
		if (local28 == null) {
			local8 = arg0.anInt5592 * 88370061 | arg2 + 65536 << 10;
			local16 = (Class3_Sub1_Sub6) Class512.aClass153_1.method23146((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
			if (local28 == null) {
				local8 = arg0.anInt5592 * 88370061 | 0x3FFFC00;
				local16 = (Class3_Sub1_Sub6) Class512.aClass153_1.method23146((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class403.method27630(local28);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass634_1 = arg0;
					Class512.aClass153_1.method23147(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class403.method27630(local28);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass634_1 = arg0;
				Class512.aClass153_1.method23147(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class403.method27630(local28);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass634_1 = arg0;
			Class512.aClass153_1.method23147(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "(I)V", line = 43)
	void method32514() {
		this.aClass186_4 = null;
		this.aClass178_18 = null;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "()V", line = 43)
	void method32518() {
		this.aClass186_4 = null;
		this.aClass178_18 = null;
	}

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "()V", line = 43)
	void method32519() {
		this.aClass186_4 = null;
		this.aClass178_18 = null;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "()V", line = 43)
	void method32520() {
		this.aClass186_4 = null;
		this.aClass178_18 = null;
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "(Lclient!afk;I)V", line = 106)
	static final void method32526(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(3) Class438 local3 = client.aClass370_1.method26950();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface43 local9 = null;
		if (arg0.anInt1183 * 1349018393 == 0) {
			local9 = (Interface43) local3.method28066(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (arg0.anInt1183 * 1349018393 == 1) {
			local9 = (Interface43) local3.method28200(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (arg0.anInt1183 * 1349018393 == 2) {
			local9 = (Interface43) local3.method28150(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, client.anInterface48_1);
		}
		if (arg0.anInt1183 * 1349018393 == 3) {
			local9 = (Interface43) local3.method28053(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (local9 == null) {
			arg0.anInt1185 = 2005441187;
			arg0.anInt1190 = 0;
			arg0.anInt1186 = 0;
		} else {
			arg0.anInt1185 = local9.method11163() * -2005441187;
			arg0.anInt1190 = local9.method11146() * -508931319;
			arg0.anInt1186 = local9.method11147() * -1764008949;
		}
	}

	@OriginalMember(owner = "client!vq", name = "kb", descriptor = "(Lclient!vs;B)V", line = 6037)
	static final void method32523(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class445.method28340(local16, arg0);
	}

	@OriginalMember(owner = "client!vq", name = "lq", descriptor = "(Lclient!vs;B)V", line = 6267)
	static final void method32524(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class301.method25663(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!vq", name = "ts", descriptor = "(Lclient!vs;I)V", line = 7563)
	static final void method32522(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(37) String local37 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13 == 99) {
			Class215.method24289(local37);
		} else if (local13 == 98) {
			Class544.method32604(local37);
		} else {
			Class121.method22823(local13, local23, "", "", "", local37);
		}
	}
}
