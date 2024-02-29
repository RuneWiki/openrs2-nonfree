package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tx")
public final class Class566 {

	@OriginalMember(owner = "client!tx", name = "cf", descriptor = "I")
	public static int anInt5341;

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "[B")
	static byte[] aByteArray97 = new byte[520];

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "Lclient!abj;")
	Class34 aClass34_7 = null;

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "Lclient!abj;")
	Class34 aClass34_8 = null;

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "I")
	int anInt5340 = -350737752;

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "I")
	int anInt5339;

	@OriginalMember(owner = "client!tx", name = "<init>", descriptor = "(ILclient!abj;Lclient!abj;I)V", line = 13)
	public Class566(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3) {
		this.anInt5339 = arg0 * 156486639;
		this.aClass34_7 = arg1;
		this.aClass34_8 = arg2;
		this.anInt5340 = arg3 * -993662599;
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(II)[B", line = 21)
	public byte[] method31358(@OriginalArg(0) int arg0) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass34_8.method550() < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass34_8.method542((long) (arg0 * 6));
				this.aClass34_8.method553(aByteArray97, 0, 6);
				@Pc(56) int local56 = ((aByteArray97[0] & 0xFF) << 16) + ((aByteArray97[1] & 0xFF) << 8) + (aByteArray97[2] & 0xFF);
				@Pc(78) int local78 = (aByteArray97[5] & 0xFF) + ((aByteArray97[3] & 0xFF) << 16) + ((aByteArray97[4] & 0xFF) << 8);
				if (local56 < 0 || local56 > this.anInt5340 * 456995017) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass34_7.method550() / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass34_7.method542((long) local78 * 520L);
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
							this.aClass34_7.method553(aByteArray97, 0, local134 + local144);
							local183 = ((aByteArray97[0] & 0xFF) << 24) + ((aByteArray97[1] & 0xFF) << 16) + ((aByteArray97[2] & 0xFF) << 8) + (aByteArray97[3] & 0xFF);
							local197 = ((aByteArray97[4] & 0xFF) << 8) + (aByteArray97[5] & 0xFF);
							local219 = ((aByteArray97[7] & 0xFF) << 8) + ((aByteArray97[6] & 0xFF) << 16) + (aByteArray97[8] & 0xFF);
							local225 = aByteArray97[9] & 0xFF;
						} else {
							if (local134 > 512) {
								local134 = 512;
							}
							local144 = 8;
							this.aClass34_7.method553(aByteArray97, 0, local134 + local144);
							local183 = (aByteArray97[1] & 0xFF) + ((aByteArray97[0] & 0xFF) << 8);
							local197 = (aByteArray97[3] & 0xFF) + ((aByteArray97[2] & 0xFF) << 8);
							local219 = ((aByteArray97[4] & 0xFF) << 16) + ((aByteArray97[5] & 0xFF) << 8) + (aByteArray97[6] & 0xFF);
							local225 = aByteArray97[7] & 0xFF;
						}
						if (local183 == arg0 && local197 == local113 && this.anInt5339 * -1673477361 == local225) {
							if (local219 >= 0 && (long) local219 <= this.aClass34_7.method550() / 520L) {
								@Pc(334) int local334 = local134 + local144;
								for (@Pc(336) int local336 = local144; local336 < local334; local336++) {
									local109[local111++] = aByteArray97[local336];
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

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(I[BI)Z", line = 76)
	public boolean method31359(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(I[BI)Z", line = 76)
	public boolean method31360(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "(I[BI)Z", line = 76)
	public boolean method31361(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "(I[BII)Z", line = 76)
	public boolean method31362(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "(I[BI)Z", line = 76)
	public boolean method31363(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "(I[BI)Z", line = 76)
	public boolean method31364(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			if (arg2 < 0 || arg2 > this.anInt5340 * 456995017) {
				throw new IllegalArgumentException("" + this.anInt5339 * -1673477361 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31365(arg0, arg1, arg2, true);
			if (!local43) {
				local43 = this.method31365(arg0, arg1, arg2, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "(I[BIZI)Z", line = 87)
	boolean method31365(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass34_8.method550() < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass34_8.method542((long) (arg0 * 6));
					this.aClass34_8.method553(aByteArray97, 0, 6);
					local58 = (aByteArray97[5] & 0xFF) + ((aByteArray97[4] & 0xFF) << 8) + ((aByteArray97[3] & 0xFF) << 16);
					if (local58 <= 0 || (long) local58 > this.aClass34_7.method550() / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray97[0] = (byte) (arg2 >> 16);
				aByteArray97[1] = (byte) (arg2 >> 8);
				aByteArray97[2] = (byte) arg2;
				aByteArray97[3] = (byte) (local58 >> 16);
				aByteArray97[4] = (byte) (local58 >> 8);
				aByteArray97[5] = (byte) local58;
				this.aClass34_8.method542((long) (arg0 * 6));
				this.aClass34_8.method562(aByteArray97, 0, 6);
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				while (true) {
					if (local143 < arg2) {
						label154: {
							@Pc(150) int local150 = 0;
							@Pc(202) int local202;
							if (arg3) {
								this.aClass34_7.method542((long) local58 * 520L);
								@Pc(216) int local216;
								@Pc(244) int local244;
								if (arg0 > 65535) {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 10);
									} catch (@Pc(171) EOFException local171) {
										break label154;
									}
									local202 = ((aByteArray97[2] & 0xFF) << 8) + ((aByteArray97[1] & 0xFF) << 16) + ((aByteArray97[0] & 0xFF) << 24) + (aByteArray97[3] & 0xFF);
									local216 = ((aByteArray97[4] & 0xFF) << 8) + (aByteArray97[5] & 0xFF);
									local150 = (aByteArray97[8] & 0xFF) + ((aByteArray97[6] & 0xFF) << 16) + ((aByteArray97[7] & 0xFF) << 8);
									local244 = aByteArray97[9] & 0xFF;
								} else {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 8);
									} catch (@Pc(254) EOFException local254) {
										break label154;
									}
									local202 = ((aByteArray97[0] & 0xFF) << 8) + (aByteArray97[1] & 0xFF);
									local216 = (aByteArray97[3] & 0xFF) + ((aByteArray97[2] & 0xFF) << 8);
									local150 = (aByteArray97[6] & 0xFF) + ((aByteArray97[4] & 0xFF) << 16) + ((aByteArray97[5] & 0xFF) << 8);
									local244 = aByteArray97[7] & 0xFF;
								}
								if (arg0 != local202 || local145 != local216 || this.anInt5339 * -1673477361 != local244) {
									local19 = false;
									return local19;
								}
								if (local150 < 0 || (long) local150 > this.aClass34_7.method550() / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local150 == 0) {
								arg3 = false;
								local150 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
								if (local150 == 0) {
									local150++;
								}
								if (local58 == local150) {
									local150++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local143 <= 510) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 24);
								aByteArray97[1] = (byte) (arg0 >> 16);
								aByteArray97[2] = (byte) (arg0 >> 8);
								aByteArray97[3] = (byte) arg0;
								aByteArray97[4] = (byte) (local145 >> 8);
								aByteArray97[5] = (byte) local145;
								aByteArray97[6] = (byte) (local150 >> 16);
								aByteArray97[7] = (byte) (local150 >> 8);
								aByteArray97[8] = (byte) local150;
								aByteArray97[9] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 10);
								local202 = arg2 - local143;
								if (local202 > 510) {
									local202 = 510;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							} else {
								if (arg2 - local143 <= 512) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 8);
								aByteArray97[1] = (byte) arg0;
								aByteArray97[2] = (byte) (local145 >> 8);
								aByteArray97[3] = (byte) local145;
								aByteArray97[4] = (byte) (local150 >> 16);
								aByteArray97[5] = (byte) (local150 >> 8);
								aByteArray97[6] = (byte) local150;
								aByteArray97[7] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 8);
								local202 = arg2 - local143;
								if (local202 > 512) {
									local202 = 512;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							}
							local58 = local150;
							local145++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(576) IOException local576) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "(I[BIZ)Z", line = 87)
	boolean method31366(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass34_8.method550() < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass34_8.method542((long) (arg0 * 6));
					this.aClass34_8.method553(aByteArray97, 0, 6);
					local58 = (aByteArray97[5] & 0xFF) + ((aByteArray97[4] & 0xFF) << 8) + ((aByteArray97[3] & 0xFF) << 16);
					if (local58 <= 0 || (long) local58 > this.aClass34_7.method550() / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray97[0] = (byte) (arg2 >> 16);
				aByteArray97[1] = (byte) (arg2 >> 8);
				aByteArray97[2] = (byte) arg2;
				aByteArray97[3] = (byte) (local58 >> 16);
				aByteArray97[4] = (byte) (local58 >> 8);
				aByteArray97[5] = (byte) local58;
				this.aClass34_8.method542((long) (arg0 * 6));
				this.aClass34_8.method562(aByteArray97, 0, 6);
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				while (true) {
					if (local143 < arg2) {
						label154: {
							@Pc(150) int local150 = 0;
							@Pc(202) int local202;
							if (arg3) {
								this.aClass34_7.method542((long) local58 * 520L);
								@Pc(216) int local216;
								@Pc(244) int local244;
								if (arg0 > 65535) {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 10);
									} catch (@Pc(171) EOFException local171) {
										break label154;
									}
									local202 = ((aByteArray97[2] & 0xFF) << 8) + ((aByteArray97[1] & 0xFF) << 16) + ((aByteArray97[0] & 0xFF) << 24) + (aByteArray97[3] & 0xFF);
									local216 = ((aByteArray97[4] & 0xFF) << 8) + (aByteArray97[5] & 0xFF);
									local150 = (aByteArray97[8] & 0xFF) + ((aByteArray97[6] & 0xFF) << 16) + ((aByteArray97[7] & 0xFF) << 8);
									local244 = aByteArray97[9] & 0xFF;
								} else {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 8);
									} catch (@Pc(254) EOFException local254) {
										break label154;
									}
									local202 = ((aByteArray97[0] & 0xFF) << 8) + (aByteArray97[1] & 0xFF);
									local216 = (aByteArray97[3] & 0xFF) + ((aByteArray97[2] & 0xFF) << 8);
									local150 = (aByteArray97[6] & 0xFF) + ((aByteArray97[4] & 0xFF) << 16) + ((aByteArray97[5] & 0xFF) << 8);
									local244 = aByteArray97[7] & 0xFF;
								}
								if (arg0 != local202 || local145 != local216 || this.anInt5339 * -1673477361 != local244) {
									local19 = false;
									return local19;
								}
								if (local150 < 0 || (long) local150 > this.aClass34_7.method550() / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local150 == 0) {
								arg3 = false;
								local150 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
								if (local150 == 0) {
									local150++;
								}
								if (local58 == local150) {
									local150++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local143 <= 510) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 24);
								aByteArray97[1] = (byte) (arg0 >> 16);
								aByteArray97[2] = (byte) (arg0 >> 8);
								aByteArray97[3] = (byte) arg0;
								aByteArray97[4] = (byte) (local145 >> 8);
								aByteArray97[5] = (byte) local145;
								aByteArray97[6] = (byte) (local150 >> 16);
								aByteArray97[7] = (byte) (local150 >> 8);
								aByteArray97[8] = (byte) local150;
								aByteArray97[9] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 10);
								local202 = arg2 - local143;
								if (local202 > 510) {
									local202 = 510;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							} else {
								if (arg2 - local143 <= 512) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 8);
								aByteArray97[1] = (byte) arg0;
								aByteArray97[2] = (byte) (local145 >> 8);
								aByteArray97[3] = (byte) local145;
								aByteArray97[4] = (byte) (local150 >> 16);
								aByteArray97[5] = (byte) (local150 >> 8);
								aByteArray97[6] = (byte) local150;
								aByteArray97[7] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 8);
								local202 = arg2 - local143;
								if (local202 > 512) {
									local202 = 512;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							}
							local58 = local150;
							local145++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(576) IOException local576) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "(I[BIZ)Z", line = 87)
	boolean method31367(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class34 local3 = this.aClass34_7;
		synchronized (this.aClass34_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass34_8.method550() < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass34_8.method542((long) (arg0 * 6));
					this.aClass34_8.method553(aByteArray97, 0, 6);
					local58 = (aByteArray97[5] & 0xFF) + ((aByteArray97[4] & 0xFF) << 8) + ((aByteArray97[3] & 0xFF) << 16);
					if (local58 <= 0 || (long) local58 > this.aClass34_7.method550() / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray97[0] = (byte) (arg2 >> 16);
				aByteArray97[1] = (byte) (arg2 >> 8);
				aByteArray97[2] = (byte) arg2;
				aByteArray97[3] = (byte) (local58 >> 16);
				aByteArray97[4] = (byte) (local58 >> 8);
				aByteArray97[5] = (byte) local58;
				this.aClass34_8.method542((long) (arg0 * 6));
				this.aClass34_8.method562(aByteArray97, 0, 6);
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				while (true) {
					if (local143 < arg2) {
						label154: {
							@Pc(150) int local150 = 0;
							@Pc(202) int local202;
							if (arg3) {
								this.aClass34_7.method542((long) local58 * 520L);
								@Pc(216) int local216;
								@Pc(244) int local244;
								if (arg0 > 65535) {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 10);
									} catch (@Pc(171) EOFException local171) {
										break label154;
									}
									local202 = ((aByteArray97[2] & 0xFF) << 8) + ((aByteArray97[1] & 0xFF) << 16) + ((aByteArray97[0] & 0xFF) << 24) + (aByteArray97[3] & 0xFF);
									local216 = ((aByteArray97[4] & 0xFF) << 8) + (aByteArray97[5] & 0xFF);
									local150 = (aByteArray97[8] & 0xFF) + ((aByteArray97[6] & 0xFF) << 16) + ((aByteArray97[7] & 0xFF) << 8);
									local244 = aByteArray97[9] & 0xFF;
								} else {
									try {
										this.aClass34_7.method553(aByteArray97, 0, 8);
									} catch (@Pc(254) EOFException local254) {
										break label154;
									}
									local202 = ((aByteArray97[0] & 0xFF) << 8) + (aByteArray97[1] & 0xFF);
									local216 = (aByteArray97[3] & 0xFF) + ((aByteArray97[2] & 0xFF) << 8);
									local150 = (aByteArray97[6] & 0xFF) + ((aByteArray97[4] & 0xFF) << 16) + ((aByteArray97[5] & 0xFF) << 8);
									local244 = aByteArray97[7] & 0xFF;
								}
								if (arg0 != local202 || local145 != local216 || this.anInt5339 * -1673477361 != local244) {
									local19 = false;
									return local19;
								}
								if (local150 < 0 || (long) local150 > this.aClass34_7.method550() / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local150 == 0) {
								arg3 = false;
								local150 = (int) ((this.aClass34_7.method550() + 519L) / 520L);
								if (local150 == 0) {
									local150++;
								}
								if (local58 == local150) {
									local150++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local143 <= 510) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 24);
								aByteArray97[1] = (byte) (arg0 >> 16);
								aByteArray97[2] = (byte) (arg0 >> 8);
								aByteArray97[3] = (byte) arg0;
								aByteArray97[4] = (byte) (local145 >> 8);
								aByteArray97[5] = (byte) local145;
								aByteArray97[6] = (byte) (local150 >> 16);
								aByteArray97[7] = (byte) (local150 >> 8);
								aByteArray97[8] = (byte) local150;
								aByteArray97[9] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 10);
								local202 = arg2 - local143;
								if (local202 > 510) {
									local202 = 510;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							} else {
								if (arg2 - local143 <= 512) {
									local150 = 0;
								}
								aByteArray97[0] = (byte) (arg0 >> 8);
								aByteArray97[1] = (byte) arg0;
								aByteArray97[2] = (byte) (local145 >> 8);
								aByteArray97[3] = (byte) local145;
								aByteArray97[4] = (byte) (local150 >> 16);
								aByteArray97[5] = (byte) (local150 >> 8);
								aByteArray97[6] = (byte) local150;
								aByteArray97[7] = (byte) (this.anInt5339 * -1673477361);
								this.aClass34_7.method542((long) local58 * 520L);
								this.aClass34_7.method562(aByteArray97, 0, 8);
								local202 = arg2 - local143;
								if (local202 > 512) {
									local202 = 512;
								}
								this.aClass34_7.method562(arg1, local143, local202);
								local143 += local202;
							}
							local58 = local150;
							local145++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(576) IOException local576) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(IIIIIIIIIB)V", line = 160)
	static final void method31368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass517_1.method30441().method29665(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		client.aClass517_1.method30459().method12515(Class284.aClass86_9, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222();
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
			client.aClass517_1.method30459().method12503(Class284.aClass86_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, local55);
		}
		Class143_Sub28.method15928(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "(Lclient!yf;I)V", line = 189)
	static void method31369(@OriginalArg(0) Class665 arg0) {
		@Pc(14) int local14 = Class69.method984(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local14;
	}

	@OriginalMember(owner = "client!tx", name = "toString", descriptor = "()Ljava/lang/String;", line = 198)
	@Override
	public String toString() {
		return "" + this.anInt5339 * -1673477361;
	}

	@OriginalMember(owner = "client!tx", name = "rs", descriptor = "()Ljava/lang/String;", line = 198)
	public String method31370() {
		return "" + this.anInt5339 * -1673477361;
	}

	@OriginalMember(owner = "client!tx", name = "ro", descriptor = "()Ljava/lang/String;", line = 198)
	public String method31371() {
		return "" + this.anInt5339 * -1673477361;
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(B)Lclient!yf;", line = 198)
	static final Class665 method31372() {
		if (Class674.anInt5798 * -1038070683 == Class674.anArrayList5.size()) {
			Class674.anArrayList5.add(new Class665());
		}
		@Pc(18) Class665 local18 = (Class665) Class674.anArrayList5.get(Class674.anInt5798 * -1038070683);
		Class674.anInt5798 += -672955027;
		return local18;
	}

	@OriginalMember(owner = "client!tx", name = "dq", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5041)
	static final void method31373(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3886 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 1610564069;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!tx", name = "ek", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5391)
	static final void method31374(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean670 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!tx", name = "uf", descriptor = "(Lclient!yf;I)V", line = 8323)
	static final void method31375(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class77_Sub1_Sub2) Class248.aClass35_Sub19_1.method18319(local12)).anInt267 * 1857484701;
	}

	@OriginalMember(owner = "client!tx", name = "vn", descriptor = "(Lclient!yf;B)V", line = 8360)
	static final void method31376(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class55.aClass124_1.method11089(local12);
	}

	@OriginalMember(owner = "client!tx", name = "aon", descriptor = "(Lclient!yf;I)V", line = 12066)
	static final void method31377(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1, local12);
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!tx", name = "arc", descriptor = "(Lclient!yf;B)V", line = 12495)
	static final void method31378(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1.method16065();
	}

	@OriginalMember(owner = "client!tx", name = "avq", descriptor = "(Lclient!yf;I)V", line = 13180)
	static final void method31379(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1.method15044() ? 1 : 0;
	}
}
