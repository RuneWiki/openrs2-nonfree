package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public abstract class Class56 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!wk;")
	final Class553 aClass553_24 = new Class553();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
	long aLong91 = -7841437243271428499L;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "J")
	long aLong90 = 3331049426808663143L;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	int anInt1444 = -1043361507;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	int anInt1443 = -663376299;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 16)
	Class56() {
	}

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "(B)V", line = 19)
	void method12564() {
		if (this.method12571()) {
			@Pc(5) Class3_Sub23 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass553_24.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class3_Sub22 local22 = (Class3_Sub22) local15.next();
					if (local5 != null && local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7 >= 252 - (this.method12575() + 6)) {
						break label100;
					}
					local22.method33656();
					@Pc(47) int local47 = local22.method19867();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method19854();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (this.anInt1444 * -159234357 == local62 && this.anInt1443 * 948838659 == local47) {
						local22.method19859();
					} else {
						if (local5 == null) {
							local5 = this.method12572();
							local5.aClass3_Sub41_Sub1_1.method20250(0);
							local7 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
							local5.aClass3_Sub41_Sub1_1.anInt2803 += -1837960662;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong90 * 3363890924204101801L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt1444 * -159234357;
							local139 = local47 - this.anInt1443 * 948838659;
							local151 = (int) ((local22.method19857() - this.aLong90 * 3363890924204101801L) / 20L);
							local9 = (int) ((long) local9 + (local22.method19857() - this.aLong90 * 3363890924204101801L) % 20L);
						}
						this.anInt1444 = local62 * 1043361507;
						this.anInt1443 = local47 * 663376299;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass3_Sub41_Sub1_1.method20251((local151 << 12) + (local132 << 6) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 128);
							local5.aClass3_Sub41_Sub1_1.method20251(local139 + (local132 << 8));
						} else if (local151 < 32) {
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						} else {
							local5.aClass3_Sub41_Sub1_1.method20251((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						}
						local11++;
						this.method12569(local5.aClass3_Sub41_Sub1_1, local22);
						this.aLong90 = local22.method19857() * -3331049426808663143L;
						local22.method19859();
					}
				}
			}
			if (local5 != null) {
				local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7);
				@Pc(347) int local347 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local7 * -918980331;
				local5.aClass3_Sub41_Sub1_1.method20250(local9 / local11);
				local5.aClass3_Sub41_Sub1_1.method20250(local9 % local11);
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local347 * -918980331;
				client.aClass82_2.method21601(local5);
			}
		}
		this.method12566();
	}

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "()V", line = 19)
	void method12567() {
		if (this.method12571()) {
			@Pc(5) Class3_Sub23 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass553_24.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class3_Sub22 local22 = (Class3_Sub22) local15.next();
					if (local5 != null && local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7 >= 252 - (this.method12575() + 6)) {
						break label100;
					}
					local22.method33656();
					@Pc(47) int local47 = local22.method19867();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method19854();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (this.anInt1444 * -159234357 == local62 && this.anInt1443 * 948838659 == local47) {
						local22.method19859();
					} else {
						if (local5 == null) {
							local5 = this.method12572();
							local5.aClass3_Sub41_Sub1_1.method20250(0);
							local7 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
							local5.aClass3_Sub41_Sub1_1.anInt2803 += -1837960662;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong90 * 3363890924204101801L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt1444 * -159234357;
							local139 = local47 - this.anInt1443 * 948838659;
							local151 = (int) ((local22.method19857() - this.aLong90 * 3363890924204101801L) / 20L);
							local9 = (int) ((long) local9 + (local22.method19857() - this.aLong90 * 3363890924204101801L) % 20L);
						}
						this.anInt1444 = local62 * 1043361507;
						this.anInt1443 = local47 * 663376299;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass3_Sub41_Sub1_1.method20251((local151 << 12) + (local132 << 6) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 128);
							local5.aClass3_Sub41_Sub1_1.method20251(local139 + (local132 << 8));
						} else if (local151 < 32) {
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						} else {
							local5.aClass3_Sub41_Sub1_1.method20251((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						}
						local11++;
						this.method12569(local5.aClass3_Sub41_Sub1_1, local22);
						this.aLong90 = local22.method19857() * -3331049426808663143L;
						local22.method19859();
					}
				}
			}
			if (local5 != null) {
				local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7);
				@Pc(347) int local347 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local7 * -918980331;
				local5.aClass3_Sub41_Sub1_1.method20250(local9 / local11);
				local5.aClass3_Sub41_Sub1_1.method20250(local9 % local11);
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local347 * -918980331;
				client.aClass82_2.method21601(local5);
			}
		}
		this.method12566();
	}

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "()V", line = 19)
	void method12588() {
		if (this.method12571()) {
			@Pc(5) Class3_Sub23 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass553_24.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class3_Sub22 local22 = (Class3_Sub22) local15.next();
					if (local5 != null && local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7 >= 252 - (this.method12575() + 6)) {
						break label100;
					}
					local22.method33656();
					@Pc(47) int local47 = local22.method19867();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method19854();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (this.anInt1444 * -159234357 == local62 && this.anInt1443 * 948838659 == local47) {
						local22.method19859();
					} else {
						if (local5 == null) {
							local5 = this.method12572();
							local5.aClass3_Sub41_Sub1_1.method20250(0);
							local7 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
							local5.aClass3_Sub41_Sub1_1.anInt2803 += -1837960662;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong90 * 3363890924204101801L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt1444 * -159234357;
							local139 = local47 - this.anInt1443 * 948838659;
							local151 = (int) ((local22.method19857() - this.aLong90 * 3363890924204101801L) / 20L);
							local9 = (int) ((long) local9 + (local22.method19857() - this.aLong90 * 3363890924204101801L) % 20L);
						}
						this.anInt1444 = local62 * 1043361507;
						this.anInt1443 = local47 * 663376299;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass3_Sub41_Sub1_1.method20251((local151 << 12) + (local132 << 6) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 128);
							local5.aClass3_Sub41_Sub1_1.method20251(local139 + (local132 << 8));
						} else if (local151 < 32) {
							local5.aClass3_Sub41_Sub1_1.method20250(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						} else {
							local5.aClass3_Sub41_Sub1_1.method20251((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass3_Sub41_Sub1_1.method20254(Integer.MIN_VALUE);
							} else {
								local5.aClass3_Sub41_Sub1_1.method20254(local62 | local47 << 16);
							}
						}
						local11++;
						this.method12569(local5.aClass3_Sub41_Sub1_1, local22);
						this.aLong90 = local22.method19857() * -3331049426808663143L;
						local22.method19859();
					}
				}
			}
			if (local5 != null) {
				local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local7);
				@Pc(347) int local347 = local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local7 * -918980331;
				local5.aClass3_Sub41_Sub1_1.method20250(local9 / local11);
				local5.aClass3_Sub41_Sub1_1.method20250(local9 % local11);
				local5.aClass3_Sub41_Sub1_1.anInt2803 = local347 * -918980331;
				client.aClass82_2.method21601(local5);
			}
		}
		this.method12566();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 104)
	void method12583() {
		this.aClass553_24.method32701();
		this.aLong91 = -7841437243271428499L;
		this.aLong90 = 3331049426808663143L;
		this.anInt1444 = -1043361507;
		this.anInt1443 = -663376299;
	}

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "()V", line = 104)
	void method12584() {
		this.aClass553_24.method32701();
		this.aLong91 = -7841437243271428499L;
		this.aLong90 = 3331049426808663143L;
		this.anInt1444 = -1043361507;
		this.anInt1443 = -663376299;
	}

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "()V", line = 104)
	void method12585() {
		this.aClass553_24.method32701();
		this.aLong91 = -7841437243271428499L;
		this.aLong90 = 3331049426808663143L;
		this.anInt1444 = -1043361507;
		this.anInt1443 = -663376299;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(Lclient!agg;I)V", line = 112)
	void method12576(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass553_24.method32702(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(Lclient!agg;)V", line = 112)
	void method12582(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass553_24.method32702(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(Lclient!agg;I)I", line = 117)
	int method12563(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong91 * 7590467496336870555L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method19857() - this.aLong91 * 7590467496336870555L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong91 = arg0.method19857() * 7841437243271428499L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "(Lclient!agg;IB)I", line = 117)
	int method12570(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong91 * 7590467496336870555L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method19857() - this.aLong91 * 7590467496336870555L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong91 = arg0.method19857() * 7841437243271428499L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(Lclient!agg;I)I", line = 117)
	int method12587(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong91 * 7590467496336870555L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method19857() - this.aLong91 * 7590467496336870555L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong91 = arg0.method19857() * 7841437243271428499L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!uc", name = "at", descriptor = "(Lclient!agg;I)I", line = 117)
	int method12589(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong91 * 7590467496336870555L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method19857() - this.aLong91 * 7590467496336870555L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong91 = arg0.method19857() * 7841437243271428499L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "([BI)V", line = 605)
	static void method12593(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class479.anInt5144 = local4.method20271() * -1956438823;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "ot", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6723)
	static final void method12594(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(18) int[] local18 = Class201.method24159(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray10 = Class484.method29109(local13, arg2);
		arg0.anIntArray369 = local18;
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!uc", name = "yt", descriptor = "(Lclient!vs;B)V", line = 8531)
	static final void method12590(@OriginalArg(0) Class536 arg0) {
		if (Class357.aClass245_1 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
			arg0.aClass245_4 = Class357.aClass245_1;
			arg0.aMap15.put(Class43.aClass43_59, Class456.method28484(arg0.aClass245_4));
		}
	}

	@OriginalMember(owner = "client!uc", name = "zj", descriptor = "(Lclient!vs;I)V", line = 8617)
	static final void method12591(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.method24804((String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
	}

	@OriginalMember(owner = "client!uc", name = "ajl", descriptor = "(Lclient!vs;B)V", line = 10683)
	static final void method12592(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class80.aClass23_Sub1_1.method5872(Class56_Sub1.method11928(local12), true);
		client.aBoolean586 = true;
	}

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "()Z")
	abstract boolean method12565();

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "(I)V")
	abstract void method12566();

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "(Lclient!ahb;Lclient!agg;)V")
	abstract void method12568(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1);

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "(Lclient!ahb;Lclient!agg;I)V")
	abstract void method12569(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1);

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "(I)Z")
	abstract boolean method12571();

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "(I)Lclient!agh;")
	abstract Class3_Sub23 method12572();

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
	abstract void method12573();

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	abstract void method12574();

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)I")
	abstract int method12575();

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "()I")
	abstract int method12577();

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()I")
	abstract int method12578();

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(Lclient!ahb;Lclient!agg;)V")
	abstract void method12579(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1);

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "(Lclient!ahb;Lclient!agg;)V")
	abstract void method12580(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1);

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "(Lclient!ahb;Lclient!agg;)V")
	abstract void method12581(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1);

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "()Lclient!agh;")
	abstract Class3_Sub23 method12586();
}
