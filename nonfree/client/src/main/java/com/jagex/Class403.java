package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class403 {

	@OriginalMember(owner = "client!qa", name = "fi", descriptor = "Lclient!ny;")
	public static Class359 aClass359_65;

	@OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
	public static int anInt4808;

	@OriginalMember(owner = "client!qa", name = "fz", descriptor = "Lclient!ny;")
	public static Class359 aClass359_66;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "[B")
	static byte[] aByteArray83 = new byte[520];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!xa;")
	Class569 aClass569_7 = null;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!xa;")
	Class569 aClass569_8 = null;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	int anInt4806 = 1866648792;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	int anInt4807;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!xa;Lclient!xa;I)V", line = 13)
	public Class403(@OriginalArg(0) int arg0, @OriginalArg(1) Class569 arg1, @OriginalArg(2) Class569 arg2, @OriginalArg(3) int arg3) {
		this.anInt4807 = arg0 * -2062618223;
		this.aClass569_7 = arg1;
		this.aClass569_8 = arg2;
		this.anInt4806 = arg3 * -1252251593;
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(IS)[B", line = 21)
	public byte[] method27623(@OriginalArg(0) int arg0) {
		@Pc(3) Class569 local3 = this.aClass569_7;
		synchronized (this.aClass569_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass569_8.method32994() < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass569_8.method32982((long) (arg0 * 6));
				this.aClass569_8.method32985(aByteArray83, 0, 6);
				@Pc(56) int local56 = (aByteArray83[2] & 0xFF) + ((aByteArray83[0] & 0xFF) << 16) + ((aByteArray83[1] & 0xFF) << 8);
				@Pc(78) int local78 = (aByteArray83[5] & 0xFF) + ((aByteArray83[4] & 0xFF) << 8) + ((aByteArray83[3] & 0xFF) << 16);
				if (local56 < 0 || local56 > this.anInt4806 * -1635512953) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass569_7.method32994() / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass569_7.method32982((long) local78 * 520L);
						@Pc(134) int local134 = local56 - local111;
						@Pc(183) int local183;
						@Pc(197) int local197;
						@Pc(219) int local219;
						@Pc(225) int local225;
						@Pc(144) byte local144;
						if (arg0 > 65535) {
							if (local134 > 510) {
								local134 = 510;
							}
							local144 = 10;
							this.aClass569_7.method32985(aByteArray83, 0, local144 + local134);
							local183 = (aByteArray83[3] & 0xFF) + ((aByteArray83[0] & 0xFF) << 24) + ((aByteArray83[1] & 0xFF) << 16) + ((aByteArray83[2] & 0xFF) << 8);
							local197 = (aByteArray83[5] & 0xFF) + ((aByteArray83[4] & 0xFF) << 8);
							local219 = (aByteArray83[8] & 0xFF) + ((aByteArray83[7] & 0xFF) << 8) + ((aByteArray83[6] & 0xFF) << 16);
							local225 = aByteArray83[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass569_7.method32985(aByteArray83, 0, local134 + local144);
							local183 = ((aByteArray83[0] & 0xFF) << 8) + (aByteArray83[1] & 0xFF);
							local197 = (aByteArray83[3] & 0xFF) + ((aByteArray83[2] & 0xFF) << 8);
							local219 = (aByteArray83[6] & 0xFF) + ((aByteArray83[5] & 0xFF) << 8) + ((aByteArray83[4] & 0xFF) << 16);
							local225 = aByteArray83[7] & 0xFF;
						}
						if (local183 == arg0 && local197 == local113 && local225 == this.anInt4807 * -1034817679) {
							if (local219 >= 0 && (long) local219 <= this.aClass569_7.method32994() / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray83[local336];
								}
								local78 = local219;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(353) byte[] local353 = local109;
					return local353;
				}
				local17 = null;
			} catch (@Pc(357) IOException local357) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BII)Z", line = 76)
	public boolean method27624(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class569 local3 = this.aClass569_7;
		synchronized (this.aClass569_7) {
			if (arg2 < 0 || arg2 > this.anInt4806 * -1635512953) {
				throw new IllegalArgumentException("" + this.anInt4807 * -1034817679 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method27625(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method27625(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(I[BI)Z", line = 76)
	public boolean method27628(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class569 local3 = this.aClass569_7;
		synchronized (this.aClass569_7) {
			if (arg2 < 0 || arg2 > this.anInt4806 * -1635512953) {
				throw new IllegalArgumentException("" + this.anInt4807 * -1034817679 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method27625(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method27625(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I[BI)Z", line = 76)
	public boolean method27629(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class569 local3 = this.aClass569_7;
		synchronized (this.aClass569_7) {
			if (arg2 < 0 || arg2 > this.anInt4806 * -1635512953) {
				throw new IllegalArgumentException("" + this.anInt4807 * -1034817679 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method27625(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method27625(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I[BIZI)Z", line = 87)
	boolean method27625(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class569 local3 = this.aClass569_7;
		synchronized (this.aClass569_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass569_8.method32994() < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass569_8.method32982((long) (arg0 * 6));
					this.aClass569_8.method32985(aByteArray83, 0, 6);
					local58 = (aByteArray83[5] & 0xFF) + ((aByteArray83[3] & 0xFF) << 16) + ((aByteArray83[4] & 0xFF) << 8);
					if (local58 <= 0 || (long) local58 > this.aClass569_7.method32994() / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass569_7.method32994() + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray83[0] = (byte) (arg2 >> 16);
				aByteArray83[1] = (byte) (arg2 >> 8);
				aByteArray83[2] = (byte) arg2;
				aByteArray83[3] = (byte) (local58 >> 16);
				aByteArray83[4] = (byte) (local58 >> 8);
				aByteArray83[5] = (byte) local58;
				this.aClass569_8.method32982((long) (arg0 * 6));
				this.aClass569_8.method32984(aByteArray83, 0, 6);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass569_7.method32982((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass569_7.method32985(aByteArray83, 0, 10);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = ((aByteArray83[2] & 0xFF) << 8) + ((aByteArray83[1] & 0xFF) << 16) + ((aByteArray83[0] & 0xFF) << 24) + (aByteArray83[3] & 0xFF);
									local215 = ((aByteArray83[4] & 0xFF) << 8) + (aByteArray83[5] & 0xFF);
									local149 = (aByteArray83[8] & 0xFF) + ((aByteArray83[6] & 0xFF) << 16) + ((aByteArray83[7] & 0xFF) << 8);
									local243 = aByteArray83[9] & 0xFF;
								} else {
									try {
										this.aClass569_7.method32985(aByteArray83, 0, 8);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray83[1] & 0xFF) + ((aByteArray83[0] & 0xFF) << 8);
									local215 = (aByteArray83[3] & 0xFF) + ((aByteArray83[2] & 0xFF) << 8);
									local149 = ((aByteArray83[4] & 0xFF) << 16) + ((aByteArray83[5] & 0xFF) << 8) + (aByteArray83[6] & 0xFF);
									local243 = aByteArray83[7] & 0xFF;
								}
								if (arg0 != local201 || local144 != local215 || local243 != this.anInt4807 * -1034817679) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass569_7.method32994() / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass569_7.method32994() + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray83[0] = (byte) (arg0 >> 24);
								aByteArray83[1] = (byte) (arg0 >> 16);
								aByteArray83[2] = (byte) (arg0 >> 8);
								aByteArray83[3] = (byte) arg0;
								aByteArray83[4] = (byte) (local144 >> 8);
								aByteArray83[5] = (byte) local144;
								aByteArray83[6] = (byte) (local149 >> 16);
								aByteArray83[7] = (byte) (local149 >> 8);
								aByteArray83[8] = (byte) local149;
								aByteArray83[9] = (byte) (this.anInt4807 * -1034817679);
								this.aClass569_7.method32982((long) local58 * 520L);
								this.aClass569_7.method32984(aByteArray83, 0, 10);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass569_7.method32984(arg1, local142, local201);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray83[0] = (byte) (arg0 >> 8);
								aByteArray83[1] = (byte) arg0;
								aByteArray83[2] = (byte) (local144 >> 8);
								aByteArray83[3] = (byte) local144;
								aByteArray83[4] = (byte) (local149 >> 16);
								aByteArray83[5] = (byte) (local149 >> 8);
								aByteArray83[6] = (byte) local149;
								aByteArray83[7] = (byte) (this.anInt4807 * -1034817679);
								this.aClass569_7.method32982((long) local58 * 520L);
								this.aClass569_7.method32984(aByteArray83, 0, 8);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass569_7.method32984(arg1, local142, local201);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "([BI)Lclient!amj;", line = 89)
	static Class3_Sub1_Sub6 method27630(@OriginalArg(0) byte[] arg0) {
		return new Class3_Sub1_Sub6(new Class3_Sub41(arg0), Class548.anInterface9_4);
	}

	@OriginalMember(owner = "client!qa", name = "ou", descriptor = "()Ljava/lang/String;", line = 198)
	public String method27626() {
		return "" + this.anInt4807 * -1034817679;
	}

	@OriginalMember(owner = "client!qa", name = "toString", descriptor = "()Ljava/lang/String;", line = 198)
	@Override
	public String toString() {
		return "" + this.anInt4807 * -1034817679;
	}

	@OriginalMember(owner = "client!qa", name = "ox", descriptor = "()Ljava/lang/String;", line = 198)
	public String method27627() {
		return "" + this.anInt4807 * -1034817679;
	}

	@OriginalMember(owner = "client!qa", name = "ct", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4474)
	static final void method27631(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3506 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 245699203;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class3_Sub35_Sub1.method18873(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!qa", name = "my", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6339)
	static final void method27632(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray37 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!qa", name = "xl", descriptor = "(Lclient!vs;B)V", line = 8338)
	static final void method27634(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class591.method33336(local13);
	}

	@OriginalMember(owner = "client!qa", name = "aah", descriptor = "(Lclient!vs;I)V", line = 8850)
	static final void method27633(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local13 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else if (local23 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Integer.MAX_VALUE;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) Math.pow((double) local13, 1.0D / (double) local23);
		}
	}
}
