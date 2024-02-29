package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xs")
public abstract class Class147 {

	@OriginalMember(owner = "client!xs", name = "do", descriptor = "Lclient!dp;")
	public static Class209 aClass209_7;

	@OriginalMember(owner = "client!xs", name = "p", descriptor = "Lclient!zm;")
	final Class695 aClass695_30 = new Class695();

	@OriginalMember(owner = "client!xs", name = "c", descriptor = "J")
	long aLong109 = -4186390681563283225L;

	@OriginalMember(owner = "client!xs", name = "v", descriptor = "J")
	long aLong110 = -1284943277404071613L;

	@OriginalMember(owner = "client!xs", name = "l", descriptor = "I")
	int anInt2159 = -1093590437;

	@OriginalMember(owner = "client!xs", name = "y", descriptor = "I")
	int anInt2160 = 1059153073;

	@OriginalMember(owner = "client!xs", name = "<init>", descriptor = "()V", line = 16)
	Class147() {
	}

	@OriginalMember(owner = "client!xs", name = "p", descriptor = "(I)V", line = 19)
	void method15607() {
		if (this.method15629()) {
			@Pc(5) Class77_Sub20 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass695_30.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class77_Sub42 local22 = (Class77_Sub42) local15.next();
					if (local5 != null && local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local7 >= 252 - (this.method15641() + 6)) {
						break label100;
					}
					local22.method24063();
					@Pc(47) int local47 = local22.method22717();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22716();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2159 * -908279251 && local47 == this.anInt2160 * 1690672047) {
						local22.method22720();
					} else {
						if (local5 == null) {
							local5 = this.method15643();
							local5.aClass77_Sub39_Sub1_2.method22403(0);
							local7 = local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
							local5.aClass77_Sub39_Sub1_2.anInt3089 += 1520029430;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong110 * 1164426520149525653L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2159 * -908279251;
							local139 = local47 - this.anInt2160 * 1690672047;
							local151 = (int) ((local22.method22719() - this.aLong110 * 1164426520149525653L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22719() - this.aLong110 * 1164426520149525653L) % 20L);
						}
						this.anInt2159 = local62 * 1093590437;
						this.anInt2160 = local47 * -1059153073;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass77_Sub39_Sub1_2.method22408(local139 + (local132 << 6) + (local151 << 12));
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass77_Sub39_Sub1_2.method22403(local151 + 128);
							local5.aClass77_Sub39_Sub1_2.method22408((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass77_Sub39_Sub1_2.method22403(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass77_Sub39_Sub1_2.method22417(Integer.MIN_VALUE);
							} else {
								local5.aClass77_Sub39_Sub1_2.method22417(local62 | local47 << 16);
							}
						} else {
							local5.aClass77_Sub39_Sub1_2.method22408((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass77_Sub39_Sub1_2.method22417(Integer.MIN_VALUE);
							} else {
								local5.aClass77_Sub39_Sub1_2.method22417(local62 | local47 << 16);
							}
						}
						local11++;
						this.method15628(local5.aClass77_Sub39_Sub1_2, local22);
						this.aLong110 = local22.method22719() * 1284943277404071613L;
						local22.method22720();
					}
				}
			}
			if (local5 != null) {
				local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local7);
				@Pc(347) int local347 = local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
				local5.aClass77_Sub39_Sub1_2.anInt3089 = local7 * -1387468933;
				local5.aClass77_Sub39_Sub1_2.method22403(local9 / local11);
				local5.aClass77_Sub39_Sub1_2.method22403(local9 % local11);
				local5.aClass77_Sub39_Sub1_2.anInt3089 = local347 * -1387468933;
				client.aClass82_2.method2004(local5);
			}
		}
		this.method15642();
	}

	@OriginalMember(owner = "client!xs", name = "b", descriptor = "()V", line = 19)
	void method15608() {
		if (this.method15629()) {
			@Pc(5) Class77_Sub20 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass695_30.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class77_Sub42 local22 = (Class77_Sub42) local15.next();
					if (local5 != null && local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local7 >= 252 - (this.method15641() + 6)) {
						break label100;
					}
					local22.method24063();
					@Pc(47) int local47 = local22.method22717();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22716();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2159 * -908279251 && local47 == this.anInt2160 * 1690672047) {
						local22.method22720();
					} else {
						if (local5 == null) {
							local5 = this.method15643();
							local5.aClass77_Sub39_Sub1_2.method22403(0);
							local7 = local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
							local5.aClass77_Sub39_Sub1_2.anInt3089 += 1520029430;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong110 * 1164426520149525653L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2159 * -908279251;
							local139 = local47 - this.anInt2160 * 1690672047;
							local151 = (int) ((local22.method22719() - this.aLong110 * 1164426520149525653L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22719() - this.aLong110 * 1164426520149525653L) % 20L);
						}
						this.anInt2159 = local62 * 1093590437;
						this.anInt2160 = local47 * -1059153073;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass77_Sub39_Sub1_2.method22408(local139 + (local132 << 6) + (local151 << 12));
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass77_Sub39_Sub1_2.method22403(local151 + 128);
							local5.aClass77_Sub39_Sub1_2.method22408((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass77_Sub39_Sub1_2.method22403(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass77_Sub39_Sub1_2.method22417(Integer.MIN_VALUE);
							} else {
								local5.aClass77_Sub39_Sub1_2.method22417(local62 | local47 << 16);
							}
						} else {
							local5.aClass77_Sub39_Sub1_2.method22408((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass77_Sub39_Sub1_2.method22417(Integer.MIN_VALUE);
							} else {
								local5.aClass77_Sub39_Sub1_2.method22417(local62 | local47 << 16);
							}
						}
						local11++;
						this.method15628(local5.aClass77_Sub39_Sub1_2, local22);
						this.aLong110 = local22.method22719() * 1284943277404071613L;
						local22.method22720();
					}
				}
			}
			if (local5 != null) {
				local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local7);
				@Pc(347) int local347 = local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
				local5.aClass77_Sub39_Sub1_2.anInt3089 = local7 * -1387468933;
				local5.aClass77_Sub39_Sub1_2.method22403(local9 / local11);
				local5.aClass77_Sub39_Sub1_2.method22403(local9 % local11);
				local5.aClass77_Sub39_Sub1_2.anInt3089 = local347 * -1387468933;
				client.aClass82_2.method2004(local5);
			}
		}
		this.method15642();
	}

	@OriginalMember(owner = "client!xs", name = "a", descriptor = "()V", line = 104)
	void method15609() {
		this.aClass695_30.method36380();
		this.aLong109 = -4186390681563283225L;
		this.aLong110 = -1284943277404071613L;
		this.anInt2159 = -1093590437;
		this.anInt2160 = 1059153073;
	}

	@OriginalMember(owner = "client!xs", name = "c", descriptor = "(I)V", line = 104)
	void method15610() {
		this.aClass695_30.method36380();
		this.aLong109 = -4186390681563283225L;
		this.aLong110 = -1284943277404071613L;
		this.anInt2159 = -1093590437;
		this.anInt2160 = 1059153073;
	}

	@OriginalMember(owner = "client!xs", name = "h", descriptor = "()V", line = 104)
	void method15611() {
		this.aClass695_30.method36380();
		this.aLong109 = -4186390681563283225L;
		this.aLong110 = -1284943277404071613L;
		this.anInt2159 = -1093590437;
		this.anInt2160 = 1059153073;
	}

	@OriginalMember(owner = "client!xs", name = "n", descriptor = "()V", line = 104)
	void method15612() {
		this.aClass695_30.method36380();
		this.aLong109 = -4186390681563283225L;
		this.aLong110 = -1284943277404071613L;
		this.anInt2159 = -1093590437;
		this.anInt2160 = 1059153073;
	}

	@OriginalMember(owner = "client!xs", name = "m", descriptor = "()V", line = 104)
	void method15613() {
		this.aClass695_30.method36380();
		this.aLong109 = -4186390681563283225L;
		this.aLong110 = -1284943277404071613L;
		this.anInt2159 = -1093590437;
		this.anInt2160 = 1059153073;
	}

	@OriginalMember(owner = "client!xs", name = "v", descriptor = "(Lclient!akz;I)V", line = 112)
	void method15614(@OriginalArg(0) Class77_Sub42 arg0) {
		this.aClass695_30.method36383(arg0);
	}

	@OriginalMember(owner = "client!xs", name = "aj", descriptor = "(Lclient!akz;)V", line = 112)
	void method15615(@OriginalArg(0) Class77_Sub42 arg0) {
		this.aClass695_30.method36383(arg0);
	}

	@OriginalMember(owner = "client!xs", name = "ai", descriptor = "(Lclient!akz;)V", line = 112)
	void method15616(@OriginalArg(0) Class77_Sub42 arg0) {
		this.aClass695_30.method36383(arg0);
	}

	@OriginalMember(owner = "client!xs", name = "l", descriptor = "(Lclient!akz;IB)I", line = 117)
	int method15617(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "ao", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15618(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "ax", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15619(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "ag", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15620(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "ak", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15621(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "au", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15622(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "al", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15623(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "ar", descriptor = "(Lclient!akz;I)I", line = 117)
	int method15624(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong109 * -7567887986269541079L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22719() - this.aLong109 * -7567887986269541079L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong109 = arg0.method22719() * 4186390681563283225L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xs", name = "k", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;", line = 194)
	public static String method15625(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg2.length();
		@Pc(7) int local7 = local2;
		@Pc(11) int local11 = local5 - 1;
		if (local11 != 0) {
			@Pc(15) int local15 = 0;
			while (true) {
				local15 = arg0.indexOf(arg1, local15);
				if (local15 < 0) {
					break;
				}
				local15++;
				local7 += local11;
			}
		}
		@Pc(34) StringBuilder local34 = new StringBuilder(local7);
		@Pc(36) int local36 = 0;
		while (true) {
			@Pc(41) int local41 = arg0.indexOf(arg1, local36);
			if (local41 < 0) {
				local34.append(arg0.substring(local36));
				return local34.toString();
			}
			local34.append(arg0.substring(local36, local41));
			local34.append(arg2);
			local36 = local41 + 1;
		}
	}

	@OriginalMember(owner = "client!xs", name = "agx", descriptor = "(Lclient!yf;B)V", line = 10471)
	static final void method15626(@OriginalArg(0) Class665 arg0) {
		arg0.aClass404_1 = new Class404();
		arg0.aClass404_1.anInt4703 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] * 167533425;
		arg0.aClass404_1.aClass77_Sub1_Sub13_1 = RuntimeException_Sub4.aClass41_2.method688(arg0.aClass404_1.anInt4703 * -1791556207);
		arg0.aClass404_1.anIntArray460 = new int[arg0.aClass404_1.aClass77_Sub1_Sub13_1.method22314()];
	}

	@OriginalMember(owner = "client!xs", name = "s", descriptor = "()V")
	abstract void method15627();

	@OriginalMember(owner = "client!xs", name = "w", descriptor = "(Lclient!akv;Lclient!akz;B)V")
	abstract void method15628(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1);

	@OriginalMember(owner = "client!xs", name = "q", descriptor = "(B)Z")
	abstract boolean method15629();

	@OriginalMember(owner = "client!xs", name = "k", descriptor = "()I")
	abstract int method15630();

	@OriginalMember(owner = "client!xs", name = "d", descriptor = "()V")
	abstract void method15631();

	@OriginalMember(owner = "client!xs", name = "r", descriptor = "()V")
	abstract void method15632();

	@OriginalMember(owner = "client!xs", name = "g", descriptor = "()Z")
	abstract boolean method15633();

	@OriginalMember(owner = "client!xs", name = "z", descriptor = "()Lclient!ajt;")
	abstract Class77_Sub20 method15634();

	@OriginalMember(owner = "client!xs", name = "j", descriptor = "()Lclient!ajt;")
	abstract Class77_Sub20 method15635();

	@OriginalMember(owner = "client!xs", name = "i", descriptor = "()Lclient!ajt;")
	abstract Class77_Sub20 method15636();

	@OriginalMember(owner = "client!xs", name = "u", descriptor = "()I")
	abstract int method15637();

	@OriginalMember(owner = "client!xs", name = "e", descriptor = "()I")
	abstract int method15638();

	@OriginalMember(owner = "client!xs", name = "f", descriptor = "(Lclient!akv;Lclient!akz;)V")
	abstract void method15639(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1);

	@OriginalMember(owner = "client!xs", name = "o", descriptor = "(Lclient!akv;Lclient!akz;)V")
	abstract void method15640(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1);

	@OriginalMember(owner = "client!xs", name = "y", descriptor = "(I)I")
	abstract int method15641();

	@OriginalMember(owner = "client!xs", name = "t", descriptor = "(B)V")
	abstract void method15642();

	@OriginalMember(owner = "client!xs", name = "x", descriptor = "(I)Lclient!ajt;")
	abstract Class77_Sub20 method15643();
}
