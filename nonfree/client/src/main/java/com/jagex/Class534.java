package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public class Class534 {

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!zx;")
	Class151 aClass151_7;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!wp;")
	Class626 aClass626_7;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!dv;")
	Class84 aClass84_7;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	int anInt5179;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!arp;")
	Class77_Sub1_Sub16 aClass77_Sub1_Sub16_5;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "[Z")
	boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!ve;")
	Class594 aClass594_2;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "Z")
	boolean aBoolean785 = false;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
	int anInt5182 = -853568467;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	int anInt5181 = 0;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "Z")
	boolean aBoolean786 = false;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
	boolean aBoolean787 = false;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_15;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	int anInt5177;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	int anInt5178;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	int anInt5180;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "Lclient!alc;")
	Class104_Sub1 aClass104_Sub1_24;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "B")
	byte aByte161;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
	boolean aBoolean784;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Lclient!zx;")
	Class151 aClass151_8;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!dx;Lclient!anu;Lclient!vm;IIILclient!alc;ZII)V", line = 47)
	Class534(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class35_Sub12 arg1, @OriginalArg(2) Class599 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class104_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass35_Sub12_15 = arg1;
		this.anInt5177 = arg2.anInt5510 * 947750589;
		this.anInt5178 = arg3 * 243748439;
		this.anInt5180 = arg4 * -1083780653;
		this.aClass104_Sub1_24 = arg6;
		this.aBoolean786 = arg8 != -1;
		this.aByte161 = (byte) arg5;
		this.aBoolean785 = arg7;
		this.aBoolean784 = arg0.method20206() && arg2.aBoolean816 && !this.aBoolean785;
		this.aClass151_8 = new Class151_Sub3(arg6, false);
		this.method30816(false, arg8, 1, this.aBoolean786 ? arg9 : 0);
	}

	@OriginalMember(owner = "client!sh", name = "gk", descriptor = "(IIILclient!dv;B)Lclient!tu;", line = 59)
	static Class563 method30780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3) {
		return arg3 == null ? null : new Class563(arg0, arg1, arg2, arg3.method6820(), arg3.method6906(), arg3.method6822(), arg3.method6824(), arg3.method6825(), arg3.method6826(), arg3.method6817());
	}

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(II)V", line = 62)
	public void method30781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass151_7 = null;
		if (arg1 > 0) {
			this.aClass151_7 = new Class151_Sub3(this.aClass104_Sub1_24, false);
			this.aClass151_7.method23413(arg0, arg1, 1, false);
		} else {
			this.aBoolean786 = true;
			this.method30816(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "(III)V", line = 62)
	public void method30782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass151_7 = null;
		if (arg1 > 0) {
			this.aClass151_7 = new Class151_Sub3(this.aClass104_Sub1_24, false);
			this.aClass151_7.method23413(arg0, arg1, 1, false);
		} else {
			this.aBoolean786 = true;
			this.method30816(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "()I", line = 74)
	int method30783() {
		return this.anInt5181 * 1225303721;
	}

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "()I", line = 74)
	int method30784() {
		return this.anInt5181 * 1225303721;
	}

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "()I", line = 74)
	int method30785() {
		return this.anInt5181 * 1225303721;
	}

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "()I", line = 74)
	int method30786() {
		return this.anInt5181 * 1225303721;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I", line = 74)
	int method30787() {
		return this.anInt5181 * 1225303721;
	}

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "(Lclient!ve;B)V", line = 78)
	void method30788(@OriginalArg(0) Class594 arg0) {
		this.aClass594_2 = arg0;
		this.aClass84_7 = null;
	}

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "(Lclient!ve;)V", line = 78)
	void method30789(@OriginalArg(0) Class594 arg0) {
		this.aClass594_2 = arg0;
		this.aClass84_7 = null;
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(Lclient!ve;)V", line = 78)
	void method30790(@OriginalArg(0) Class594 arg0) {
		this.aClass594_2 = arg0;
		this.aClass84_7 = null;
	}

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "(B)I", line = 83)
	int method30791() {
		return -this.method30787();
	}

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "()I", line = 83)
	int method30792() {
		return -this.method30787();
	}

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "(I)Lclient!vm;", line = 87)
	Class599 method30793() {
		return (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
	}

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "()Lclient!vm;", line = 87)
	Class599 method30794() {
		return (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!dx;IZZ)Lclient!dv;", line = 91)
	final Class84 method30795(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
		if (local9.anIntArray511 != null) {
			local9 = local9.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
		}
		if (local9 == null) {
			this.method30809(arg0);
			this.anInt5182 = -853568467;
			return null;
		}
		if (!this.aBoolean786 && local9.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
			this.method30816(true, -1, 0, 0);
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
		this.method30813(this.aClass104_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean784 & !this.aBoolean787 & Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5182 = local9.anInt5510 * 905362699;
			return null;
		}
		@Pc(108) Class447 local108 = this.aClass104_Sub1_24.method24085().aClass447_61;
		@Pc(112) Class556 local112 = client.aClass517_1.method30435();
		if (arg3) {
			local112.method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
			this.aBoolean787 = false;
		}
		@Pc(138) Class88 local138 = local112.aClass88Array1[this.aByte161];
		@Pc(146) Class88 local146;
		if (this.aBoolean785) {
			local146 = local112.aClass88Array2[0];
		} else {
			local146 = this.aByte161 < 3 ? local112.aClass88Array1[this.aByte161 + 1] : null;
		}
		@Pc(163) Class84 local163 = null;
		if (this.aClass151_8.method23396()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local163 = local9.method32002(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, this.aClass151_8, this.aClass594_2);
			if (local163 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.anInt5181 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray29 == null) {
						this.aBooleanArray29 = new boolean[4];
					}
					this.aClass77_Sub1_Sub16_5 = local163.method6819(this.aClass77_Sub1_Sub16_5);
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
			this.aClass84_7 = null;
		} else if (this.aClass84_7 != null && (this.aClass84_7.method6875() & arg1) == arg1 && this.anInt5182 * -1632623525 == local9.anInt5510 * -1562722583) {
			local163 = this.aClass84_7;
		} else {
			if (this.aClass84_7 != null) {
				arg1 |= this.aClass84_7.method6875();
			}
			@Pc(373) Class10 local373 = local9.method32000(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, arg3, this.aClass594_2);
			if (local373 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.aClass84_7 = null;
				this.anInt5181 = 0;
			} else {
				this.aClass84_7 = local163 = (Class84) local373.anObject1;
				if (arg3) {
					this.aClass77_Sub1_Sub16_5 = (Class77_Sub1_Sub16) local373.anObject2;
					this.aBooleanArray29 = null;
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, null);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
		}
		this.anInt5182 = local9.anInt5510 * 905362699;
		return local163;
	}

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "(Lclient!dx;IZZI)Lclient!dv;", line = 91)
	final Class84 method30796(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
		if (local9.anIntArray511 != null) {
			local9 = local9.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
		}
		if (local9 == null) {
			this.method30809(arg0);
			this.anInt5182 = -853568467;
			return null;
		}
		if (!this.aBoolean786 && local9.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
			this.method30816(true, -1, 0, 0);
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
		this.method30813(this.aClass104_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean784 & !this.aBoolean787 & Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5182 = local9.anInt5510 * 905362699;
			return null;
		}
		@Pc(108) Class447 local108 = this.aClass104_Sub1_24.method24085().aClass447_61;
		@Pc(112) Class556 local112 = client.aClass517_1.method30435();
		if (arg3) {
			local112.method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
			this.aBoolean787 = false;
		}
		@Pc(138) Class88 local138 = local112.aClass88Array1[this.aByte161];
		@Pc(146) Class88 local146;
		if (this.aBoolean785) {
			local146 = local112.aClass88Array2[0];
		} else {
			local146 = this.aByte161 < 3 ? local112.aClass88Array1[this.aByte161 + 1] : null;
		}
		@Pc(163) Class84 local163 = null;
		if (this.aClass151_8.method23396()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local163 = local9.method32002(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, this.aClass151_8, this.aClass594_2);
			if (local163 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.anInt5181 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray29 == null) {
						this.aBooleanArray29 = new boolean[4];
					}
					this.aClass77_Sub1_Sub16_5 = local163.method6819(this.aClass77_Sub1_Sub16_5);
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
			this.aClass84_7 = null;
		} else if (this.aClass84_7 != null && (this.aClass84_7.method6875() & arg1) == arg1 && this.anInt5182 * -1632623525 == local9.anInt5510 * -1562722583) {
			local163 = this.aClass84_7;
		} else {
			if (this.aClass84_7 != null) {
				arg1 |= this.aClass84_7.method6875();
			}
			@Pc(373) Class10 local373 = local9.method32000(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, arg3, this.aClass594_2);
			if (local373 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.aClass84_7 = null;
				this.anInt5181 = 0;
			} else {
				this.aClass84_7 = local163 = (Class84) local373.anObject1;
				if (arg3) {
					this.aClass77_Sub1_Sub16_5 = (Class77_Sub1_Sub16) local373.anObject2;
					this.aBooleanArray29 = null;
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, null);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
		}
		this.anInt5182 = local9.anInt5510 * 905362699;
		return local163;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lclient!dx;IZZ)Lclient!dv;", line = 91)
	final Class84 method30797(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
		if (local9.anIntArray511 != null) {
			local9 = local9.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
		}
		if (local9 == null) {
			this.method30809(arg0);
			this.anInt5182 = -853568467;
			return null;
		}
		if (!this.aBoolean786 && local9.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
			this.method30816(true, -1, 0, 0);
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
		this.method30813(this.aClass104_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean784 & !this.aBoolean787 & Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5182 = local9.anInt5510 * 905362699;
			return null;
		}
		@Pc(108) Class447 local108 = this.aClass104_Sub1_24.method24085().aClass447_61;
		@Pc(112) Class556 local112 = client.aClass517_1.method30435();
		if (arg3) {
			local112.method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
			this.aBoolean787 = false;
		}
		@Pc(138) Class88 local138 = local112.aClass88Array1[this.aByte161];
		@Pc(146) Class88 local146;
		if (this.aBoolean785) {
			local146 = local112.aClass88Array2[0];
		} else {
			local146 = this.aByte161 < 3 ? local112.aClass88Array1[this.aByte161 + 1] : null;
		}
		@Pc(163) Class84 local163 = null;
		if (this.aClass151_8.method23396()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local163 = local9.method32002(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, this.aClass151_8, this.aClass594_2);
			if (local163 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.anInt5181 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray29 == null) {
						this.aBooleanArray29 = new boolean[4];
					}
					this.aClass77_Sub1_Sub16_5 = local163.method6819(this.aClass77_Sub1_Sub16_5);
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
			this.aClass84_7 = null;
		} else if (this.aClass84_7 != null && (this.aClass84_7.method6875() & arg1) == arg1 && this.anInt5182 * -1632623525 == local9.anInt5510 * -1562722583) {
			local163 = this.aClass84_7;
		} else {
			if (this.aClass84_7 != null) {
				arg1 |= this.aClass84_7.method6875();
			}
			@Pc(373) Class10 local373 = local9.method32000(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, arg3, this.aClass594_2);
			if (local373 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.aClass84_7 = null;
				this.anInt5181 = 0;
			} else {
				this.aClass84_7 = local163 = (Class84) local373.anObject1;
				if (arg3) {
					this.aClass77_Sub1_Sub16_5 = (Class77_Sub1_Sub16) local373.anObject2;
					this.aBooleanArray29 = null;
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, null);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
		}
		this.anInt5182 = local9.anInt5510 * 905362699;
		return local163;
	}

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "(Lclient!dx;IZZ)Lclient!dv;", line = 91)
	final Class84 method30798(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
		if (local9.anIntArray511 != null) {
			local9 = local9.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
		}
		if (local9 == null) {
			this.method30809(arg0);
			this.anInt5182 = -853568467;
			return null;
		}
		if (!this.aBoolean786 && local9.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
			this.method30816(true, -1, 0, 0);
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
		this.method30813(this.aClass104_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean784 & !this.aBoolean787 & Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5182 = local9.anInt5510 * 905362699;
			return null;
		}
		@Pc(108) Class447 local108 = this.aClass104_Sub1_24.method24085().aClass447_61;
		@Pc(112) Class556 local112 = client.aClass517_1.method30435();
		if (arg3) {
			local112.method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
			this.aBoolean787 = false;
		}
		@Pc(138) Class88 local138 = local112.aClass88Array1[this.aByte161];
		@Pc(146) Class88 local146;
		if (this.aBoolean785) {
			local146 = local112.aClass88Array2[0];
		} else {
			local146 = this.aByte161 < 3 ? local112.aClass88Array1[this.aByte161 + 1] : null;
		}
		@Pc(163) Class84 local163 = null;
		if (this.aClass151_8.method23396()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local163 = local9.method32002(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, this.aClass151_8, this.aClass594_2);
			if (local163 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.anInt5181 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray29 == null) {
						this.aBooleanArray29 = new boolean[4];
					}
					this.aClass77_Sub1_Sub16_5 = local163.method6819(this.aClass77_Sub1_Sub16_5);
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, this.aBooleanArray29);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
			this.aClass84_7 = null;
		} else if (this.aClass84_7 != null && (this.aClass84_7.method6875() & arg1) == arg1 && this.anInt5182 * -1632623525 == local9.anInt5510 * -1562722583) {
			local163 = this.aClass84_7;
		} else {
			if (this.aClass84_7 != null) {
				arg1 |= this.aClass84_7.method6875();
			}
			@Pc(373) Class10 local373 = local9.method32000(arg0, arg1, this.anInt5178 * -1932952217 == 11 ? 10 : this.anInt5178 * -1932952217, this.anInt5178 * -1932952217 == 11 ? this.anInt5180 * -2129482149 + 4 : this.anInt5180 * -2129482149, local138, local146, (int) local108.aFloat277, local138.method5493((int) local108.aFloat277, (int) local108.aFloat278), (int) local108.aFloat278, arg3, this.aClass594_2);
			if (local373 == null) {
				this.aBooleanArray29 = null;
				this.aClass77_Sub1_Sub16_5 = null;
				this.aClass84_7 = null;
				this.anInt5181 = 0;
			} else {
				this.aClass84_7 = local163 = (Class84) local373.anObject1;
				if (arg3) {
					this.aClass77_Sub1_Sub16_5 = (Class77_Sub1_Sub16) local373.anObject2;
					this.aBooleanArray29 = null;
					local112.method31221(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local108.aFloat277, (int) local108.aFloat278, null);
					this.aBoolean787 = true;
				}
				this.anInt5181 = local163.method6824() * 1570856345;
				local163.method6821();
			}
		}
		this.anInt5182 = local9.anInt5510 * 905362699;
		return local163;
	}

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;IIIIZB)V", line = 171)
	void method30799(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class205[] local2 = arg1.method6938();
		@Pc(5) Class195[] local5 = arg1.method6843();
		if ((this.aClass626_7 == null || this.aClass626_7.aBoolean844) && (local2 != null || local5 != null)) {
			@Pc(28) Class599 local28 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			if (local28.anIntArray511 != null) {
				local28 = local28.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local28 != null) {
				this.aClass626_7 = Class626.method32493(client.anInt3414, true);
			}
		}
		if (this.aClass626_7 == null) {
			return;
		}
		arg1.method6851(arg2);
		if (arg7) {
			this.aClass626_7.method32515(arg0, (long) client.anInt3414, local2, local5, false);
		} else {
			this.aClass626_7.method32512((long) client.anInt3414);
		}
		this.aClass626_7.method32527(this.aByte161, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;IIIIZ)V", line = 171)
	void method30800(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class205[] local2 = arg1.method6938();
		@Pc(5) Class195[] local5 = arg1.method6843();
		if ((this.aClass626_7 == null || this.aClass626_7.aBoolean844) && (local2 != null || local5 != null)) {
			@Pc(28) Class599 local28 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			if (local28.anIntArray511 != null) {
				local28 = local28.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local28 != null) {
				this.aClass626_7 = Class626.method32493(client.anInt3414, true);
			}
		}
		if (this.aClass626_7 == null) {
			return;
		}
		arg1.method6851(arg2);
		if (arg7) {
			this.aClass626_7.method32515(arg0, (long) client.anInt3414, local2, local5, false);
		} else {
			this.aClass626_7.method32512((long) client.anInt3414);
		}
		this.aClass626_7.method32527(this.aByte161, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sh", name = "aj", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;IIIIZ)V", line = 171)
	void method30801(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class205[] local2 = arg1.method6938();
		@Pc(5) Class195[] local5 = arg1.method6843();
		if ((this.aClass626_7 == null || this.aClass626_7.aBoolean844) && (local2 != null || local5 != null)) {
			@Pc(28) Class599 local28 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			if (local28.anIntArray511 != null) {
				local28 = local28.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local28 != null) {
				this.aClass626_7 = Class626.method32493(client.anInt3414, true);
			}
		}
		if (this.aClass626_7 == null) {
			return;
		}
		arg1.method6851(arg2);
		if (arg7) {
			this.aClass626_7.method32515(arg0, (long) client.anInt3414, local2, local5, false);
		} else {
			this.aClass626_7.method32512((long) client.anInt3414);
		}
		this.aClass626_7.method32527(this.aByte161, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;IIIIZ)V", line = 171)
	void method30802(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class205[] local2 = arg1.method6938();
		@Pc(5) Class195[] local5 = arg1.method6843();
		if ((this.aClass626_7 == null || this.aClass626_7.aBoolean844) && (local2 != null || local5 != null)) {
			@Pc(28) Class599 local28 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			if (local28.anIntArray511 != null) {
				local28 = local28.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local28 != null) {
				this.aClass626_7 = Class626.method32493(client.anInt3414, true);
			}
		}
		if (this.aClass626_7 == null) {
			return;
		}
		arg1.method6851(arg2);
		if (arg7) {
			this.aClass626_7.method32515(arg0, (long) client.anInt3414, local2, local5, false);
		} else {
			this.aClass626_7.method32512((long) client.anInt3414);
		}
		this.aClass626_7.method32527(this.aByte161, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "(B)Z", line = 187)
	boolean method30803() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!sh", name = "ai", descriptor = "()Z", line = 187)
	boolean method30804() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!sh", name = "al", descriptor = "(Lclient!dx;)V", line = 191)
	void method30805(@OriginalArg(0) Class86 arg0) {
		this.method30796(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "(Lclient!dx;I)V", line = 191)
	void method30806(@OriginalArg(0) Class86 arg0) {
		this.method30796(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sh", name = "ag", descriptor = "(Lclient!dx;)V", line = 191)
	void method30807(@OriginalArg(0) Class86 arg0) {
		this.method30796(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sh", name = "ao", descriptor = "(Lclient!dx;)V", line = 191)
	void method30808(@OriginalArg(0) Class86 arg0) {
		this.method30796(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(Lclient!dx;I)V", line = 195)
	void method30809(@OriginalArg(0) Class86 arg0) {
		if (this.aClass77_Sub1_Sub16_5 != null) {
			@Pc(7) Class447 local7 = this.aClass104_Sub1_24.method24085().aClass447_61;
			client.aClass517_1.method30435().method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local7.aFloat277, (int) local7.aFloat278, this.aBooleanArray29);
			this.aBooleanArray29 = null;
			this.aClass77_Sub1_Sub16_5 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "au", descriptor = "(Lclient!dx;)V", line = 195)
	void method30810(@OriginalArg(0) Class86 arg0) {
		if (this.aClass77_Sub1_Sub16_5 != null) {
			@Pc(7) Class447 local7 = this.aClass104_Sub1_24.method24085().aClass447_61;
			client.aClass517_1.method30435().method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local7.aFloat277, (int) local7.aFloat278, this.aBooleanArray29);
			this.aBooleanArray29 = null;
			this.aClass77_Sub1_Sub16_5 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "ak", descriptor = "(Lclient!dx;)V", line = 195)
	void method30811(@OriginalArg(0) Class86 arg0) {
		if (this.aClass77_Sub1_Sub16_5 != null) {
			@Pc(7) Class447 local7 = this.aClass104_Sub1_24.method24085().aClass447_61;
			client.aClass517_1.method30435().method31224(this.aClass77_Sub1_Sub16_5, this.aByte161, (int) local7.aFloat277, (int) local7.aFloat278, this.aBooleanArray29);
			this.aBooleanArray29 = null;
			this.aClass77_Sub1_Sub16_5 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "ax", descriptor = "(Lclient!alc;)V", line = 204)
	void method30812(@OriginalArg(0) Class104_Sub1 arg0) {
		if (this.aClass151_7 != null && this.aClass151_7.method23396()) {
			this.aClass151_7.method23463(client.anInt3414 - this.anInt5179 * -1588764245);
			if (this.aClass151_7.method23445()) {
				this.aClass151_7.method23401(-1);
			}
			if (!this.aClass151_7.method23422()) {
				this.aClass151_8 = this.aClass151_7;
				this.aBoolean786 = true;
				this.anInt5179 = client.anInt3414 * -44920573;
				return;
			}
		}
		if (!this.aClass151_8.method23396()) {
			this.method30816(false, -1, 0, 0);
		} else if (this.aClass151_8.method23463(client.anInt3414 - this.anInt5179 * -1588764245)) {
			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() == 2) {
				this.aBoolean787 = false;
			}
			if (this.aClass151_8.method23445()) {
				this.aClass151_8.method23401(-1);
				this.aBoolean786 = false;
				this.method30816(false, -1, 0, 0);
			}
		}
		this.anInt5179 = client.anInt3414 * -44920573;
	}

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "(Lclient!alc;I)V", line = 204)
	void method30813(@OriginalArg(0) Class104_Sub1 arg0) {
		if (this.aClass151_7 != null && this.aClass151_7.method23396()) {
			this.aClass151_7.method23463(client.anInt3414 - this.anInt5179 * -1588764245);
			if (this.aClass151_7.method23445()) {
				this.aClass151_7.method23401(-1);
			}
			if (!this.aClass151_7.method23422()) {
				this.aClass151_8 = this.aClass151_7;
				this.aBoolean786 = true;
				this.anInt5179 = client.anInt3414 * -44920573;
				return;
			}
		}
		if (!this.aClass151_8.method23396()) {
			this.method30816(false, -1, 0, 0);
		} else if (this.aClass151_8.method23463(client.anInt3414 - this.anInt5179 * -1588764245)) {
			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() == 2) {
				this.aBoolean787 = false;
			}
			if (this.aClass151_8.method23445()) {
				this.aClass151_8.method23401(-1);
				this.aBoolean786 = false;
				this.method30816(false, -1, 0, 0);
			}
		}
		this.anInt5179 = client.anInt3414 * -44920573;
	}

	@OriginalMember(owner = "client!sh", name = "ad", descriptor = "(Lclient!alc;)V", line = 204)
	void method30814(@OriginalArg(0) Class104_Sub1 arg0) {
		if (this.aClass151_7 != null && this.aClass151_7.method23396()) {
			this.aClass151_7.method23463(client.anInt3414 - this.anInt5179 * -1588764245);
			if (this.aClass151_7.method23445()) {
				this.aClass151_7.method23401(-1);
			}
			if (!this.aClass151_7.method23422()) {
				this.aClass151_8 = this.aClass151_7;
				this.aBoolean786 = true;
				this.anInt5179 = client.anInt3414 * -44920573;
				return;
			}
		}
		if (!this.aClass151_8.method23396()) {
			this.method30816(false, -1, 0, 0);
		} else if (this.aClass151_8.method23463(client.anInt3414 - this.anInt5179 * -1588764245)) {
			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() == 2) {
				this.aBoolean787 = false;
			}
			if (this.aClass151_8.method23445()) {
				this.aClass151_8.method23401(-1);
				this.aBoolean786 = false;
				this.method30816(false, -1, 0, 0);
			}
		}
		this.anInt5179 = client.anInt3414 * -44920573;
	}

	@OriginalMember(owner = "client!sh", name = "ar", descriptor = "(Lclient!alc;)V", line = 204)
	void method30815(@OriginalArg(0) Class104_Sub1 arg0) {
		if (this.aClass151_7 != null && this.aClass151_7.method23396()) {
			this.aClass151_7.method23463(client.anInt3414 - this.anInt5179 * -1588764245);
			if (this.aClass151_7.method23445()) {
				this.aClass151_7.method23401(-1);
			}
			if (!this.aClass151_7.method23422()) {
				this.aClass151_8 = this.aClass151_7;
				this.aBoolean786 = true;
				this.anInt5179 = client.anInt3414 * -44920573;
				return;
			}
		}
		if (!this.aClass151_8.method23396()) {
			this.method30816(false, -1, 0, 0);
		} else if (this.aClass151_8.method23463(client.anInt3414 - this.anInt5179 * -1588764245)) {
			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() == 2) {
				this.aBoolean787 = false;
			}
			if (this.aClass151_8.method23445()) {
				this.aClass151_8.method23401(-1);
				this.aBoolean786 = false;
				this.method30816(false, -1, 0, 0);
			}
		}
		this.anInt5179 = client.anInt3414 * -44920573;
	}

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "(ZIIII)V", line = 231)
	void method30816(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class599 local16 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			@Pc(18) Class599 local18 = local16;
			if (local16.anIntArray511 != null) {
				local16 = local16.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.method32016()) {
				if (!local16.aBoolean818 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 1) {
					if (arg0 && this.aClass151_8.method23396() && local16.method32025(this.aClass151_8.method23399())) {
						return;
					}
					if (local16.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
						local3 = local16.aBoolean823;
					}
					local1 = local16.method32019();
					if (local16.method32017()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32016() && (!local18.aBoolean818 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 1)) {
				if (arg0 && this.aClass151_8.method23396() && local18.method32025(this.aClass151_8.method23399())) {
					return;
				}
				if (this.anInt5182 * -1632623525 != local16.anInt5510 * -1562722583) {
					local3 = local18.aBoolean823;
				}
				local1 = local18.method32019();
				if (local18.method32017()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass151_8.method23408(-1, false);
		} else {
			this.aClass151_8.method23413(local1, arg3, arg2, local3);
			this.anInt5179 = client.anInt3414 * -44920573;
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "ac", descriptor = "(ZIII)V", line = 231)
	void method30817(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class599 local16 = (Class599) this.aClass35_Sub12_15.method18319(this.anInt5177 * 1626333597);
			@Pc(18) Class599 local18 = local16;
			if (local16.anIntArray511 != null) {
				local16 = local16.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.method32016()) {
				if (!local16.aBoolean818 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 1) {
					if (arg0 && this.aClass151_8.method23396() && local16.method32025(this.aClass151_8.method23399())) {
						return;
					}
					if (local16.anInt5510 * -1562722583 != this.anInt5182 * -1632623525) {
						local3 = local16.aBoolean823;
					}
					local1 = local16.method32019();
					if (local16.method32017()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32016() && (!local18.aBoolean818 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950() == 1)) {
				if (arg0 && this.aClass151_8.method23396() && local18.method32025(this.aClass151_8.method23399())) {
					return;
				}
				if (this.anInt5182 * -1632623525 != local16.anInt5510 * -1562722583) {
					local3 = local18.aBoolean823;
				}
				local1 = local18.method32019();
				if (local18.method32017()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass151_8.method23408(-1, false);
		} else {
			this.aClass151_8.method23413(local1, arg3, arg2, local3);
			this.anInt5179 = client.anInt3414 * -44920573;
			this.aBoolean787 = false;
			this.aClass84_7 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "agd", descriptor = "(Lclient!yf;I)V", line = 10429)
	static final void method30818(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(28) Class77_Sub1_Sub19 local28 = Class615.aClass465_1.method29551(local13);
		@Pc(33) int local33 = local28.anIntArray287[local23];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local33;
	}

	@OriginalMember(owner = "client!sh", name = "arm", descriptor = "(Lclient!yf;I)V", line = 12519)
	static final void method30819(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
