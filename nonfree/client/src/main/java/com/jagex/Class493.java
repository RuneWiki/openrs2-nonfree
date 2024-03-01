package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tx")
public class Class493 {

	@OriginalMember(owner = "client!tx", name = "h", descriptor = "I")
	static final int anInt5214 = 4;

	@OriginalMember(owner = "client!tx", name = "s", descriptor = "I")
	static final int anInt5216 = 4;

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "I")
	static final int anInt5224 = 7;

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "I")
	static final int anInt5228 = 4;

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "Z")
	public boolean aBoolean811;

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "[[S")
	public short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray6;

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "I")
	public int anInt5218 = 686351820;

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "[I")
	public int[] anIntArray479 = null;

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "[I")
	public int[] anIntArray480 = null;

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "I")
	public int anInt5215 = -1318701516;

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "I")
	public int anInt5217 = -1939539500;

	@OriginalMember(owner = "client!tx", name = "b", descriptor = "I")
	public int anInt5219 = 180739631;

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "I")
	public int anInt5220 = 1607366523;

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "I")
	public int anInt5221 = 1405143501;

	@OriginalMember(owner = "client!tx", name = "j", descriptor = "I")
	public int anInt5222 = -1202292671;

	@OriginalMember(owner = "client!tx", name = "n", descriptor = "Z")
	public boolean aBoolean813 = true;

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "S")
	public short aShort177 = -1;

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "B")
	public byte aByte168 = 0;

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "Z")
	public boolean aBoolean812 = true;

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "I")
	public int anInt5225 = -345339626;

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "Z")
	public boolean aBoolean814 = true;

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "I")
	public int anInt5226 = 1097566009;

	@OriginalMember(owner = "client!tx", name = "o", descriptor = "I")
	public int anInt5227 = -1529983229;

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "I")
	public int anInt5223 = -895441977;

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "I")
	public int anInt5229 = 175695104;

	@OriginalMember(owner = "client!tx", name = "at", descriptor = "I")
	public int anInt5213 = 1654126367;

	@OriginalMember(owner = "client!tx", name = "af", descriptor = "I")
	public int anInt5212 = 543850112;

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(Lclient!ano;I)Lclient!ro;", line = 15)
	static Class437 method29299(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		@Pc(6) Class437 local6;
		if (Class437.aClass437_2 == null) {
			local6 = new Class437();
		} else {
			local6 = Class437.aClass437_2;
			Class437.aClass437_2 = Class437.aClass437_2.aClass437_3;
			local6.aClass437_3 = null;
			Class437.anInt4893 -= -270933611;
		}
		local6.aClass26_Sub1_Sub1_1 = arg0;
		return local6;
	}

	@OriginalMember(owner = "client!tx", name = "<init>", descriptor = "(Lclient!ny;)V", line = 36)
	public Class493(@OriginalArg(0) Class359 arg0) {
		@Pc(72) byte[] local72 = arg0.method26705(Class474.aClass474_3.anInt5121 * 152686723);
		this.method29295(new Class3_Sub41(local72));
	}

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "(Lclient!ahb;)V", line = 42)
	void method29294(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(1) boolean local1 = false;
		while (true) {
			while (true) {
				@Pc(5) int local5 = arg0.method20269();
				if (local5 == 0) {
					if (!local1) {
						if (this.anIntArray479 == null) {
							this.anInt5218 = 686351820;
							this.anIntArray479 = new int[4];
							this.anIntArray480 = new int[4];
						}
						for (local5 = 0; local5 < this.anIntArray479.length; local5++) {
							this.anIntArray479[local5] = 0;
							this.anIntArray480[local5] = local5 * 20;
						}
					}
					return;
				}
				@Pc(28) int local28;
				if (local5 == 1) {
					if (this.anIntArray479 == null) {
						this.anInt5218 = 686351820;
						this.anIntArray479 = new int[4];
						this.anIntArray480 = new int[4];
					}
					for (local28 = 0; local28 < this.anIntArray479.length; local28++) {
						this.anIntArray479[local28] = arg0.method20272();
						this.anIntArray480[local28] = arg0.method20272();
					}
					local1 = true;
				} else if (local5 == 2) {
					this.anInt5220 = arg0.method20375() * -1607366523;
				} else if (local5 == 3) {
					this.anInt5218 = arg0.method20269() * -902153869;
					this.anIntArray479 = new int[this.anInt5218 * -1025928261];
					this.anIntArray480 = new int[this.anInt5218 * -1025928261];
				} else if (local5 == 4) {
					this.aBoolean813 = false;
				} else if (local5 == 5) {
					this.anInt5221 = arg0.method20273() * -1405143501;
				} else if (local5 == 6) {
					this.anInt5222 = arg0.method20273() * 1202292671;
				} else if (local5 == 7) {
					this.aShortArrayArray6 = new short[10][4];
					this.aShortArrayArrayArray6 = new short[10][4][];
					for (local28 = 0; local28 < 10; local28++) {
						for (@Pc(137) int local137 = 0; local137 < 4; local137++) {
							@Pc(144) int local144 = arg0.method20271();
							if (local144 == 65535) {
								local144 = -1;
							}
							this.aShortArrayArray6[local28][local137] = (short) local144;
							@Pc(161) int local161 = arg0.method20271();
							this.aShortArrayArrayArray6[local28][local137] = new short[local161];
							for (@Pc(171) int local171 = 0; local171 < local161; local171++) {
								@Pc(178) int local178 = arg0.method20271();
								if (local178 == 65535) {
									local178 = -1;
								}
								this.aShortArrayArrayArray6[local28][local137][local171] = (short) local178;
							}
						}
					}
				} else if (local5 == 8) {
					this.aBoolean812 = false;
				} else if (local5 == 9) {
					this.anInt5225 = arg0.method20269() * 1974813835;
				} else if (local5 == 10) {
					this.aBoolean814 = false;
				} else if (local5 == 11) {
					this.anInt5226 = arg0.method20269() * -1065800429;
				} else if (local5 == 12) {
					this.anInt5227 = arg0.method20271() * 1529983229;
					this.anInt5223 = arg0.method20271() * 895441977;
				} else if (local5 == 13) {
					this.anInt5217 = arg0.method20269() * 588856949;
				} else if (local5 == 14) {
					this.anInt5215 = arg0.method20269() * 744066445;
				} else if (local5 == 15) {
					this.anInt5219 = arg0.method20269() * 1866520217;
				} else if (local5 == 16) {
					this.aBoolean811 = true;
				} else if (local5 == 17) {
					this.anInt5229 = arg0.method20275() * -502233317;
				} else if (local5 == 18) {
					this.anInt5213 = arg0.method20275() * 2120747233;
				} else if (local5 == 19) {
					this.anInt5212 = arg0.method20275() * 1310798083;
				} else if (local5 == 20) {
					this.aShort177 = (short) arg0.method20271();
					this.aByte168 = (byte) arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(Lclient!ahb;I)V", line = 42)
	void method29295(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(1) boolean local1 = false;
		while (true) {
			while (true) {
				@Pc(5) int local5 = arg0.method20269();
				if (local5 == 0) {
					if (!local1) {
						if (this.anIntArray479 == null) {
							this.anInt5218 = 686351820;
							this.anIntArray479 = new int[4];
							this.anIntArray480 = new int[4];
						}
						for (local5 = 0; local5 < this.anIntArray479.length; local5++) {
							this.anIntArray479[local5] = 0;
							this.anIntArray480[local5] = local5 * 20;
						}
					}
					return;
				}
				@Pc(28) int local28;
				if (local5 == 1) {
					if (this.anIntArray479 == null) {
						this.anInt5218 = 686351820;
						this.anIntArray479 = new int[4];
						this.anIntArray480 = new int[4];
					}
					for (local28 = 0; local28 < this.anIntArray479.length; local28++) {
						this.anIntArray479[local28] = arg0.method20272();
						this.anIntArray480[local28] = arg0.method20272();
					}
					local1 = true;
				} else if (local5 == 2) {
					this.anInt5220 = arg0.method20375() * -1607366523;
				} else if (local5 == 3) {
					this.anInt5218 = arg0.method20269() * -902153869;
					this.anIntArray479 = new int[this.anInt5218 * -1025928261];
					this.anIntArray480 = new int[this.anInt5218 * -1025928261];
				} else if (local5 == 4) {
					this.aBoolean813 = false;
				} else if (local5 == 5) {
					this.anInt5221 = arg0.method20273() * -1405143501;
				} else if (local5 == 6) {
					this.anInt5222 = arg0.method20273() * 1202292671;
				} else if (local5 == 7) {
					this.aShortArrayArray6 = new short[10][4];
					this.aShortArrayArrayArray6 = new short[10][4][];
					for (local28 = 0; local28 < 10; local28++) {
						for (@Pc(137) int local137 = 0; local137 < 4; local137++) {
							@Pc(144) int local144 = arg0.method20271();
							if (local144 == 65535) {
								local144 = -1;
							}
							this.aShortArrayArray6[local28][local137] = (short) local144;
							@Pc(161) int local161 = arg0.method20271();
							this.aShortArrayArrayArray6[local28][local137] = new short[local161];
							for (@Pc(171) int local171 = 0; local171 < local161; local171++) {
								@Pc(178) int local178 = arg0.method20271();
								if (local178 == 65535) {
									local178 = -1;
								}
								this.aShortArrayArrayArray6[local28][local137][local171] = (short) local178;
							}
						}
					}
				} else if (local5 == 8) {
					this.aBoolean812 = false;
				} else if (local5 == 9) {
					this.anInt5225 = arg0.method20269() * 1974813835;
				} else if (local5 == 10) {
					this.aBoolean814 = false;
				} else if (local5 == 11) {
					this.anInt5226 = arg0.method20269() * -1065800429;
				} else if (local5 == 12) {
					this.anInt5227 = arg0.method20271() * 1529983229;
					this.anInt5223 = arg0.method20271() * 895441977;
				} else if (local5 == 13) {
					this.anInt5217 = arg0.method20269() * 588856949;
				} else if (local5 == 14) {
					this.anInt5215 = arg0.method20269() * 744066445;
				} else if (local5 == 15) {
					this.anInt5219 = arg0.method20269() * 1866520217;
				} else if (local5 == 16) {
					this.aBoolean811 = true;
				} else if (local5 == 17) {
					this.anInt5229 = arg0.method20275() * -502233317;
				} else if (local5 == 18) {
					this.anInt5213 = arg0.method20275() * 2120747233;
				} else if (local5 == 19) {
					this.anInt5212 = arg0.method20275() * 1310798083;
				} else if (local5 == 20) {
					this.aShort177 = (short) arg0.method20271();
					this.aByte168 = (byte) arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "(Lclient!ahb;)V", line = 42)
	void method29296(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(1) boolean local1 = false;
		while (true) {
			while (true) {
				@Pc(5) int local5 = arg0.method20269();
				if (local5 == 0) {
					if (!local1) {
						if (this.anIntArray479 == null) {
							this.anInt5218 = 686351820;
							this.anIntArray479 = new int[4];
							this.anIntArray480 = new int[4];
						}
						for (local5 = 0; local5 < this.anIntArray479.length; local5++) {
							this.anIntArray479[local5] = 0;
							this.anIntArray480[local5] = local5 * 20;
						}
					}
					return;
				}
				@Pc(28) int local28;
				if (local5 == 1) {
					if (this.anIntArray479 == null) {
						this.anInt5218 = 686351820;
						this.anIntArray479 = new int[4];
						this.anIntArray480 = new int[4];
					}
					for (local28 = 0; local28 < this.anIntArray479.length; local28++) {
						this.anIntArray479[local28] = arg0.method20272();
						this.anIntArray480[local28] = arg0.method20272();
					}
					local1 = true;
				} else if (local5 == 2) {
					this.anInt5220 = arg0.method20375() * -1607366523;
				} else if (local5 == 3) {
					this.anInt5218 = arg0.method20269() * -902153869;
					this.anIntArray479 = new int[this.anInt5218 * -1025928261];
					this.anIntArray480 = new int[this.anInt5218 * -1025928261];
				} else if (local5 == 4) {
					this.aBoolean813 = false;
				} else if (local5 == 5) {
					this.anInt5221 = arg0.method20273() * -1405143501;
				} else if (local5 == 6) {
					this.anInt5222 = arg0.method20273() * 1202292671;
				} else if (local5 == 7) {
					this.aShortArrayArray6 = new short[10][4];
					this.aShortArrayArrayArray6 = new short[10][4][];
					for (local28 = 0; local28 < 10; local28++) {
						for (@Pc(137) int local137 = 0; local137 < 4; local137++) {
							@Pc(144) int local144 = arg0.method20271();
							if (local144 == 65535) {
								local144 = -1;
							}
							this.aShortArrayArray6[local28][local137] = (short) local144;
							@Pc(161) int local161 = arg0.method20271();
							this.aShortArrayArrayArray6[local28][local137] = new short[local161];
							for (@Pc(171) int local171 = 0; local171 < local161; local171++) {
								@Pc(178) int local178 = arg0.method20271();
								if (local178 == 65535) {
									local178 = -1;
								}
								this.aShortArrayArrayArray6[local28][local137][local171] = (short) local178;
							}
						}
					}
				} else if (local5 == 8) {
					this.aBoolean812 = false;
				} else if (local5 == 9) {
					this.anInt5225 = arg0.method20269() * 1974813835;
				} else if (local5 == 10) {
					this.aBoolean814 = false;
				} else if (local5 == 11) {
					this.anInt5226 = arg0.method20269() * -1065800429;
				} else if (local5 == 12) {
					this.anInt5227 = arg0.method20271() * 1529983229;
					this.anInt5223 = arg0.method20271() * 895441977;
				} else if (local5 == 13) {
					this.anInt5217 = arg0.method20269() * 588856949;
				} else if (local5 == 14) {
					this.anInt5215 = arg0.method20269() * 744066445;
				} else if (local5 == 15) {
					this.anInt5219 = arg0.method20269() * 1866520217;
				} else if (local5 == 16) {
					this.aBoolean811 = true;
				} else if (local5 == 17) {
					this.anInt5229 = arg0.method20275() * -502233317;
				} else if (local5 == 18) {
					this.anInt5213 = arg0.method20275() * 2120747233;
				} else if (local5 == 19) {
					this.anInt5212 = arg0.method20275() * 1310798083;
				} else if (local5 == 20) {
					this.aShort177 = (short) arg0.method20271();
					this.aByte168 = (byte) arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "bk", descriptor = "(Lclient!vs;I)V", line = 4215)
	static final void method29301(@OriginalArg(0) Class536 arg0) {
		@Pc(14) Class178 local14 = Class375.method27235(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		local14.aClass178Array5 = null;
		local14.aClass178Array6 = null;
		Class223.method24442(local14);
	}

	@OriginalMember(owner = "client!tx", name = "yd", descriptor = "(Lclient!vs;B)V", line = 8540)
	static final void method29300(@OriginalArg(0) Class536 arg0) {
		if (Class471.aClass245_2 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
			arg0.aClass245_4 = Class471.aClass245_2;
			arg0.aMap15.put(Class43.aClass43_59, Class456.method28484(arg0.aClass245_4));
		}
	}

	@OriginalMember(owner = "client!tx", name = "afk", descriptor = "(Lclient!vs;I)V", line = 9885)
	static final void method29298(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
	}

	@OriginalMember(owner = "client!tx", name = "aqg", descriptor = "(Lclient!vs;I)V", line = 11997)
	static final void method29297(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(5, local13 << 16 | local23, local33, "");
	}
}
