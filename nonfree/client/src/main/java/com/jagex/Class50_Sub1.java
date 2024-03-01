package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeu")
public class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!aeu", name = "cx", descriptor = "I")
	static final int anInt1081 = 0;

	@OriginalMember(owner = "client!aeu", name = "cb", descriptor = "I")
	static final int anInt1082 = 2;

	@OriginalMember(owner = "client!aeu", name = "cy", descriptor = "I")
	static final int anInt1083 = 1;

	@OriginalMember(owner = "client!aeu", name = "cz", descriptor = "I")
	static final int anInt1084 = 3;

	@OriginalMember(owner = "client!aeu", name = "fd", descriptor = "Lclient!ny;")
	public static Class359 aClass359_15;

	@OriginalMember(owner = "client!aeu", name = "cs", descriptor = "Z")
	static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!aeu", name = "ct", descriptor = "Z")
	static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!aeu", name = "cn", descriptor = "[I")
	static final int[] anIntArray160 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aeu", name = "co", descriptor = "[I")
	static final int[] anIntArray161 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!aeu", name = "cd", descriptor = "[I")
	static final int[] anIntArray162 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!aeu", name = "ch", descriptor = "[I")
	static final int[] anIntArray159 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!aeu", name = "ci", descriptor = "I")
	int anInt1085 = 165538605;

	@OriginalMember(owner = "client!aeu", name = "cr", descriptor = "Lclient!sj;")
	Class457 aClass457_1;

	@OriginalMember(owner = "client!aeu", name = "ca", descriptor = "Lclient!tg;")
	Class479 aClass479_1;

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "(B)[Lclient!la;", line = 28)
	static Class293[] method9482() {
		return new Class293[] { Class293.aClass293_11, Class293.aClass293_12, Class293.aClass293_5, Class293.aClass293_3, Class293.aClass293_10, Class293.aClass293_7, Class293.aClass293_8, Class293.aClass293_9, Class293.aClass293_6, Class293.aClass293_4, Class293.aClass293_1, Class293.aClass293_2 };
	}

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "(Lclient!agq;I)V", line = 29)
	static void method9483(@OriginalArg(0) Class3_Sub32 arg0) {
		Class402.aClass23_Sub1_2 = new Class23_Sub1(client.aClass496_1);
		Class402.aClass23_Sub1_2.method5923(Class192.aClass192_3);
		try {
			@Pc(15) Class30_Sub1 local15 = (Class30_Sub1) Class402.aClass23_Sub1_2.method5872(Class204.aClass204_5, false);
			@Pc(22) Class69_Sub2 local22 = (Class69_Sub2) Class402.aClass23_Sub1_2.method5802(Class208.aClass208_5, false);
			local15.method7446(arg0);
			local22.method14570(new Class335(0.0F, 0.0F, 0.0F));
			Class402.aClass23_Sub1_2.method5813(Class320.method25891(99999.0F, 99999.0F, 99999.0F));
			Class402.aClass23_Sub1_2.method5809(Class320.method25891(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			Class402.aClass23_Sub1_2.method5812(Class320.method25891(99999.0F, 99999.0F, 99999.0F));
			Class402.aClass23_Sub1_2.method5808(Class320.method25891(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (@Pc(65) Exception_Sub4 local65) {
		}
		Class402.anInt4804 = Class3_Sub10.aClass61_1.method12740() * 2008758633;
		Class402.anInt4805 = Class3_Sub10.aClass61_1.method12741() * -1561712435;
		Class402.aBoolean754 = true;
	}

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!rp;Lclient!sj;IIIZLclient!ni;Lclient!tg;)V", line = 66)
	public Class50_Sub1(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class457 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class346 arg6, @OriginalArg(7) Class479 arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Class555.aClass499_5, Class598.aClass575_5, arg6);
		this.aClass457_1 = arg1;
		this.aClass479_1 = arg7;
	}

	@OriginalMember(owner = "client!aeu", name = "bj", descriptor = "(Lclient!de;Lclient!ahb;IIB)V", line = 72)
	public final void method9449(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(254) int local254;
			@Pc(258) int local258;
			@Pc(58) int local58;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local27 = arg1.method20269();
				if (local27 != 0) {
					@Pc(119) int local119;
					@Pc(127) int local127;
					@Pc(131) int local131;
					if (local27 == 1) {
						local54 = arg1.method20269();
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class431 local73 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local73.anInt4872 * 2074817827 == 31) {
									@Pc(86) Class620 local86 = Class16.aClass616_3.method33684(arg1.method20271());
									local73.method27950(local86.anInt5570 * -402520065, local86.anInt5571 * 372796923, local86.anInt5568 * 1280948631, local86.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(111) Class3_Sub15 local111 = local73.aClass3_Sub15_3;
									local119 = local111.method11280() + (arg2 << 9);
									local127 = local111.method11282() + (arg3 << 9);
									local131 = local119 >> 9;
									@Pc(135) int local135 = local127 >> 9;
									if (local131 >= 0 && local135 >= 0 && local131 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
										local111.method11286(local119, this.anIntArrayArrayArray14[local73.anInt4887 * -180767789][local131][local135] - local111.method11281(), local127);
										this.aClass438_6.method28185(local73);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method20390();
							if (local245 == 0 && this.aByteArrayArrayArray7[local54] != null) {
								local254 = arg2;
								local258 = arg2 + 64;
								local119 = arg3;
								local127 = arg3 + 64;
								if (arg2 < 0) {
									local254 = 0;
								} else if (arg2 >= this.anInt1055 * -576668841) {
									local254 = this.anInt1055 * -576668841;
								}
								if (local258 < 0) {
									local258 = 0;
								} else if (local258 >= this.anInt1055 * -576668841) {
									local258 = this.anInt1055 * -576668841;
								}
								if (arg3 < 0) {
									local119 = 0;
								} else if (arg3 >= this.anInt1056 * 1605649813) {
									local119 = this.anInt1056 * 1605649813;
								}
								if (local127 < 0) {
									local127 = 0;
								} else if (local127 >= this.anInt1056 * 1605649813) {
									local127 = this.anInt1056 * 1605649813;
								}
								while (local254 < local258) {
									while (local119 < local127) {
										this.aByteArrayArrayArray7[local54][local254][local119] = 0;
										local119++;
									}
									local254++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local254 = 0; local254 < 64; local254 += 4) {
									for (local258 = 0; local258 < 64; local258 += 4) {
										@Pc(387) byte local387 = arg1.method20390();
										for (local127 = local254 + arg2; local127 < local254 + arg2 + 4; local127++) {
											for (local131 = local258 + arg3; local131 < local258 + arg3 + 4; local131++) {
												if (local127 >= 0 && local127 < this.anInt1055 * -576668841 && local131 >= 0 && local131 < this.anInt1056 * 1605649813) {
													this.aByteArrayArrayArray7[local54][local127][local131] = local387;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								if (local54 > 0) {
									local254 = arg2;
									local258 = arg2 + 64;
									local119 = arg3;
									local127 = arg3 + 64;
									if (arg2 < 0) {
										local254 = 0;
									} else if (arg2 >= this.anInt1055 * -576668841) {
										local254 = this.anInt1055 * -576668841;
									}
									if (local258 < 0) {
										local258 = 0;
									} else if (local258 >= this.anInt1055 * -576668841) {
										local258 = this.anInt1055 * -576668841;
									}
									if (arg3 < 0) {
										local119 = 0;
									} else if (arg3 >= this.anInt1056 * 1605649813) {
										local119 = this.anInt1056 * 1605649813;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (local127 >= this.anInt1056 * 1605649813) {
										local127 = this.anInt1056 * 1605649813;
									}
									while (local254 < local258) {
										while (local119 < local127) {
											this.aByteArrayArrayArray7[local54][local254][local119] = this.aByteArrayArrayArray7[local54 - 1][local254][local119];
											local119++;
										}
										local254++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local254 = (arg3 >> 3) + local54;
					if (local58 >= 0 && local58 < this.anInt1055 * -576668841 >> 3 && local254 >= 0 && local254 < this.anInt1056 * 1605649813 >> 3) {
						if (local13 != null) {
							this.aClass479_1.method28875(local58, local254, local13);
						}
						Class273.method25347(local58, local254, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray7 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray7[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local254 = local54 + (arg2 >> 2);
								local258 = local58 + (arg3 >> 2);
								if (local254 >= 0 && local254 < 26 && local258 >= 0 && local258 < 26) {
									this.aByteArrayArrayArray7[local27][local254][local258] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cc", descriptor = "(Lclient!de;Lclient!ahb;II)V", line = 72)
	public final void method9460(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(254) int local254;
			@Pc(258) int local258;
			@Pc(58) int local58;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local27 = arg1.method20269();
				if (local27 != 0) {
					@Pc(119) int local119;
					@Pc(127) int local127;
					@Pc(131) int local131;
					if (local27 == 1) {
						local54 = arg1.method20269();
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class431 local73 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local73.anInt4872 * 2074817827 == 31) {
									@Pc(86) Class620 local86 = Class16.aClass616_3.method33684(arg1.method20271());
									local73.method27950(local86.anInt5570 * -402520065, local86.anInt5571 * 372796923, local86.anInt5568 * 1280948631, local86.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(111) Class3_Sub15 local111 = local73.aClass3_Sub15_3;
									local119 = local111.method11280() + (arg2 << 9);
									local127 = local111.method11282() + (arg3 << 9);
									local131 = local119 >> 9;
									@Pc(135) int local135 = local127 >> 9;
									if (local131 >= 0 && local135 >= 0 && local131 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
										local111.method11286(local119, this.anIntArrayArrayArray14[local73.anInt4887 * -180767789][local131][local135] - local111.method11281(), local127);
										this.aClass438_6.method28185(local73);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method20390();
							if (local245 == 0 && this.aByteArrayArrayArray7[local54] != null) {
								local254 = arg2;
								local258 = arg2 + 64;
								local119 = arg3;
								local127 = arg3 + 64;
								if (arg2 < 0) {
									local254 = 0;
								} else if (arg2 >= this.anInt1055 * -576668841) {
									local254 = this.anInt1055 * -576668841;
								}
								if (local258 < 0) {
									local258 = 0;
								} else if (local258 >= this.anInt1055 * -576668841) {
									local258 = this.anInt1055 * -576668841;
								}
								if (arg3 < 0) {
									local119 = 0;
								} else if (arg3 >= this.anInt1056 * 1605649813) {
									local119 = this.anInt1056 * 1605649813;
								}
								if (local127 < 0) {
									local127 = 0;
								} else if (local127 >= this.anInt1056 * 1605649813) {
									local127 = this.anInt1056 * 1605649813;
								}
								while (local254 < local258) {
									while (local119 < local127) {
										this.aByteArrayArrayArray7[local54][local254][local119] = 0;
										local119++;
									}
									local254++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local254 = 0; local254 < 64; local254 += 4) {
									for (local258 = 0; local258 < 64; local258 += 4) {
										@Pc(387) byte local387 = arg1.method20390();
										for (local127 = local254 + arg2; local127 < local254 + arg2 + 4; local127++) {
											for (local131 = local258 + arg3; local131 < local258 + arg3 + 4; local131++) {
												if (local127 >= 0 && local127 < this.anInt1055 * -576668841 && local131 >= 0 && local131 < this.anInt1056 * 1605649813) {
													this.aByteArrayArrayArray7[local54][local127][local131] = local387;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								if (local54 > 0) {
									local254 = arg2;
									local258 = arg2 + 64;
									local119 = arg3;
									local127 = arg3 + 64;
									if (arg2 < 0) {
										local254 = 0;
									} else if (arg2 >= this.anInt1055 * -576668841) {
										local254 = this.anInt1055 * -576668841;
									}
									if (local258 < 0) {
										local258 = 0;
									} else if (local258 >= this.anInt1055 * -576668841) {
										local258 = this.anInt1055 * -576668841;
									}
									if (arg3 < 0) {
										local119 = 0;
									} else if (arg3 >= this.anInt1056 * 1605649813) {
										local119 = this.anInt1056 * 1605649813;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (local127 >= this.anInt1056 * 1605649813) {
										local127 = this.anInt1056 * 1605649813;
									}
									while (local254 < local258) {
										while (local119 < local127) {
											this.aByteArrayArrayArray7[local54][local254][local119] = this.aByteArrayArrayArray7[local54 - 1][local254][local119];
											local119++;
										}
										local254++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local254 = (arg3 >> 3) + local54;
					if (local58 >= 0 && local58 < this.anInt1055 * -576668841 >> 3 && local254 >= 0 && local254 < this.anInt1056 * 1605649813 >> 3) {
						if (local13 != null) {
							this.aClass479_1.method28875(local58, local254, local13);
						}
						Class273.method25347(local58, local254, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray7 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray7[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local254 = local54 + (arg2 >> 2);
								local258 = local58 + (arg3 >> 2);
								if (local254 >= 0 && local254 < 26 && local258 >= 0 && local258 < 26) {
									this.aByteArrayArrayArray7[local27][local254][local258] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cs", descriptor = "(Lclient!de;Lclient!ahb;II)V", line = 72)
	public final void method9474(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(254) int local254;
			@Pc(258) int local258;
			@Pc(58) int local58;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local27 = arg1.method20269();
				if (local27 != 0) {
					@Pc(119) int local119;
					@Pc(127) int local127;
					@Pc(131) int local131;
					if (local27 == 1) {
						local54 = arg1.method20269();
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class431 local73 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local73.anInt4872 * 2074817827 == 31) {
									@Pc(86) Class620 local86 = Class16.aClass616_3.method33684(arg1.method20271());
									local73.method27950(local86.anInt5570 * -402520065, local86.anInt5571 * 372796923, local86.anInt5568 * 1280948631, local86.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(111) Class3_Sub15 local111 = local73.aClass3_Sub15_3;
									local119 = local111.method11280() + (arg2 << 9);
									local127 = local111.method11282() + (arg3 << 9);
									local131 = local119 >> 9;
									@Pc(135) int local135 = local127 >> 9;
									if (local131 >= 0 && local135 >= 0 && local131 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
										local111.method11286(local119, this.anIntArrayArrayArray14[local73.anInt4887 * -180767789][local131][local135] - local111.method11281(), local127);
										this.aClass438_6.method28185(local73);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method20390();
							if (local245 == 0 && this.aByteArrayArrayArray7[local54] != null) {
								local254 = arg2;
								local258 = arg2 + 64;
								local119 = arg3;
								local127 = arg3 + 64;
								if (arg2 < 0) {
									local254 = 0;
								} else if (arg2 >= this.anInt1055 * -576668841) {
									local254 = this.anInt1055 * -576668841;
								}
								if (local258 < 0) {
									local258 = 0;
								} else if (local258 >= this.anInt1055 * -576668841) {
									local258 = this.anInt1055 * -576668841;
								}
								if (arg3 < 0) {
									local119 = 0;
								} else if (arg3 >= this.anInt1056 * 1605649813) {
									local119 = this.anInt1056 * 1605649813;
								}
								if (local127 < 0) {
									local127 = 0;
								} else if (local127 >= this.anInt1056 * 1605649813) {
									local127 = this.anInt1056 * 1605649813;
								}
								while (local254 < local258) {
									while (local119 < local127) {
										this.aByteArrayArrayArray7[local54][local254][local119] = 0;
										local119++;
									}
									local254++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local254 = 0; local254 < 64; local254 += 4) {
									for (local258 = 0; local258 < 64; local258 += 4) {
										@Pc(387) byte local387 = arg1.method20390();
										for (local127 = local254 + arg2; local127 < local254 + arg2 + 4; local127++) {
											for (local131 = local258 + arg3; local131 < local258 + arg3 + 4; local131++) {
												if (local127 >= 0 && local127 < this.anInt1055 * -576668841 && local131 >= 0 && local131 < this.anInt1056 * 1605649813) {
													this.aByteArrayArrayArray7[local54][local127][local131] = local387;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								if (local54 > 0) {
									local254 = arg2;
									local258 = arg2 + 64;
									local119 = arg3;
									local127 = arg3 + 64;
									if (arg2 < 0) {
										local254 = 0;
									} else if (arg2 >= this.anInt1055 * -576668841) {
										local254 = this.anInt1055 * -576668841;
									}
									if (local258 < 0) {
										local258 = 0;
									} else if (local258 >= this.anInt1055 * -576668841) {
										local258 = this.anInt1055 * -576668841;
									}
									if (arg3 < 0) {
										local119 = 0;
									} else if (arg3 >= this.anInt1056 * 1605649813) {
										local119 = this.anInt1056 * 1605649813;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (local127 >= this.anInt1056 * 1605649813) {
										local127 = this.anInt1056 * 1605649813;
									}
									while (local254 < local258) {
										while (local119 < local127) {
											this.aByteArrayArrayArray7[local54][local254][local119] = this.aByteArrayArrayArray7[local54 - 1][local254][local119];
											local119++;
										}
										local254++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local254 = (arg3 >> 3) + local54;
					if (local58 >= 0 && local58 < this.anInt1055 * -576668841 >> 3 && local254 >= 0 && local254 < this.anInt1056 * 1605649813 >> 3) {
						if (local13 != null) {
							this.aClass479_1.method28875(local58, local254, local13);
						}
						Class273.method25347(local58, local254, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray7 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray7[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local254 = local54 + (arg2 >> 2);
								local258 = local58 + (arg3 >> 2);
								if (local254 >= 0 && local254 < 26 && local258 >= 0 && local258 < 26) {
									this.aByteArrayArrayArray7[local27][local254][local258] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cp", descriptor = "(Lclient!de;Lclient!ahb;II)V", line = 72)
	public final void method9480(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(254) int local254;
			@Pc(258) int local258;
			@Pc(58) int local58;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local27 = arg1.method20269();
				if (local27 != 0) {
					@Pc(119) int local119;
					@Pc(127) int local127;
					@Pc(131) int local131;
					if (local27 == 1) {
						local54 = arg1.method20269();
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class431 local73 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local73.anInt4872 * 2074817827 == 31) {
									@Pc(86) Class620 local86 = Class16.aClass616_3.method33684(arg1.method20271());
									local73.method27950(local86.anInt5570 * -402520065, local86.anInt5571 * 372796923, local86.anInt5568 * 1280948631, local86.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(111) Class3_Sub15 local111 = local73.aClass3_Sub15_3;
									local119 = local111.method11280() + (arg2 << 9);
									local127 = local111.method11282() + (arg3 << 9);
									local131 = local119 >> 9;
									@Pc(135) int local135 = local127 >> 9;
									if (local131 >= 0 && local135 >= 0 && local131 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
										local111.method11286(local119, this.anIntArrayArrayArray14[local73.anInt4887 * -180767789][local131][local135] - local111.method11281(), local127);
										this.aClass438_6.method28185(local73);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method20390();
							if (local245 == 0 && this.aByteArrayArrayArray7[local54] != null) {
								local254 = arg2;
								local258 = arg2 + 64;
								local119 = arg3;
								local127 = arg3 + 64;
								if (arg2 < 0) {
									local254 = 0;
								} else if (arg2 >= this.anInt1055 * -576668841) {
									local254 = this.anInt1055 * -576668841;
								}
								if (local258 < 0) {
									local258 = 0;
								} else if (local258 >= this.anInt1055 * -576668841) {
									local258 = this.anInt1055 * -576668841;
								}
								if (arg3 < 0) {
									local119 = 0;
								} else if (arg3 >= this.anInt1056 * 1605649813) {
									local119 = this.anInt1056 * 1605649813;
								}
								if (local127 < 0) {
									local127 = 0;
								} else if (local127 >= this.anInt1056 * 1605649813) {
									local127 = this.anInt1056 * 1605649813;
								}
								while (local254 < local258) {
									while (local119 < local127) {
										this.aByteArrayArrayArray7[local54][local254][local119] = 0;
										local119++;
									}
									local254++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local254 = 0; local254 < 64; local254 += 4) {
									for (local258 = 0; local258 < 64; local258 += 4) {
										@Pc(387) byte local387 = arg1.method20390();
										for (local127 = local254 + arg2; local127 < local254 + arg2 + 4; local127++) {
											for (local131 = local258 + arg3; local131 < local258 + arg3 + 4; local131++) {
												if (local127 >= 0 && local127 < this.anInt1055 * -576668841 && local131 >= 0 && local131 < this.anInt1056 * 1605649813) {
													this.aByteArrayArrayArray7[local54][local127][local131] = local387;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray7[local54] == null) {
									this.aByteArrayArrayArray7[local54] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								if (local54 > 0) {
									local254 = arg2;
									local258 = arg2 + 64;
									local119 = arg3;
									local127 = arg3 + 64;
									if (arg2 < 0) {
										local254 = 0;
									} else if (arg2 >= this.anInt1055 * -576668841) {
										local254 = this.anInt1055 * -576668841;
									}
									if (local258 < 0) {
										local258 = 0;
									} else if (local258 >= this.anInt1055 * -576668841) {
										local258 = this.anInt1055 * -576668841;
									}
									if (arg3 < 0) {
										local119 = 0;
									} else if (arg3 >= this.anInt1056 * 1605649813) {
										local119 = this.anInt1056 * 1605649813;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (local127 >= this.anInt1056 * 1605649813) {
										local127 = this.anInt1056 * 1605649813;
									}
									while (local254 < local258) {
										while (local119 < local127) {
											this.aByteArrayArrayArray7[local54][local254][local119] = this.aByteArrayArrayArray7[local54 - 1][local254][local119];
											local119++;
										}
										local254++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local254 = (arg3 >> 3) + local54;
					if (local58 >= 0 && local58 < this.anInt1055 * -576668841 >> 3 && local254 >= 0 && local254 < this.anInt1056 * 1605649813 >> 3) {
						if (local13 != null) {
							this.aClass479_1.method28875(local58, local254, local13);
						}
						Class273.method25347(local58, local254, local15);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray7 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray7[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local254 = local54 + (arg2 >> 2);
								local258 = local58 + (arg3 >> 2);
								if (local254 >= 0 && local254 < 26 && local258 >= 0 && local258 < 26) {
									this.aByteArrayArrayArray7[local27][local254][local258] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "(I)V", line = 116)
	public static void method9484() {
		Class273.aClass161_32.method23224();
	}

	@OriginalMember(owner = "client!aeu", name = "bq", descriptor = "(Lclient!de;Lclient!ahb;IIIIIIIB)V", line = 212)
	public final void method9450(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(66) int local66;
			@Pc(319) int local319;
			@Pc(70) int local70;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local39 = arg1.method20269();
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local66 = arg1.method20269();
						if (local66 > 0) {
							for (local70 = 0; local70 < local66; local70++) {
								@Pc(85) Class431 local85 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local85.anInt4872 * 2074817827 == 31) {
									@Pc(98) Class620 local98 = Class16.aClass616_3.method33684(arg1.method20271());
									local85.method27950(local98.anInt5570 * -402520065, local98.anInt5571 * 372796923, local98.anInt5568 * 1280948631, local98.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(123) Class3_Sub15 local123 = local85.aClass3_Sub15_3;
									local129 = local123.method11280() >> 9;
									local135 = local123.method11282() >> 9;
									if (arg5 == local85.anInt4887 * -180767789 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class242.method24749(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local193 = (arg4 << 9) + Class242.method24750(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
											local123.method11286(local175, this.anIntArrayArrayArray14[arg5][local129][local135] - local123.method11281(), local193);
											this.aClass438_6.method28185(local85);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local66 = 0; local66 < 4; local66++) {
							@Pc(306) byte local306 = arg1.method20390();
							@Pc(323) int local323;
							if (local306 == 0 && this.aByteArrayArrayArray7[arg2] != null) {
								if (local66 <= arg5) {
									local319 = arg3;
									local323 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local319 = 0;
									} else if (arg3 >= this.anInt1055 * -576668841) {
										local319 = this.anInt1055 * -576668841;
									}
									if (local323 < 0) {
										local323 = 0;
									} else if (local323 >= this.anInt1055 * -576668841) {
										local323 = this.anInt1055 * -576668841;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1056 * 1605649813) {
										local129 = this.anInt1056 * 1605649813;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1056 * 1605649813) {
										local135 = this.anInt1056 * 1605649813;
									}
									while (local319 < local323) {
										while (local129 < local135) {
											this.aByteArrayArrayArray7[arg2][local319][local129] = 0;
											local129++;
										}
										local319++;
									}
								}
							} else if (local306 == 1) {
								if (this.aByteArrayArrayArray7[arg2] == null) {
									this.aByteArrayArrayArray7[arg2] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local319 = 0; local319 < 64; local319 += 4) {
									for (local323 = 0; local323 < 64; local323 += 4) {
										@Pc(452) byte local452 = arg1.method20390();
										if (local66 <= arg5) {
											for (local135 = local319; local135 < local319 + 4; local135++) {
												for (local175 = local323; local175 < local323 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class77.method21572(local135 & 0x7, local175 & 0x7, arg8);
														@Pc(509) int local509 = arg4 + Class43.method9506(local135 & 0x7, local175 & 0x7, arg8);
														if (local193 >= 0 && local193 < this.anInt1055 * -576668841 && local509 >= 0 && local509 < this.anInt1056 * 1605649813) {
															this.aByteArrayArrayArray7[arg2][local193][local509] = local452;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local306 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			if (local13 != null) {
				this.aClass479_1.method28875(arg3 >> 3, arg4 >> 3, local13);
			}
			Class273.method25347(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray7 != null && this.aByteArrayArrayArray7[arg2] != null) {
				local39 = arg3 + 7;
				local66 = arg4 + 7;
				for (local70 = arg3; local70 < local39; local70++) {
					for (local319 = arg4; local319 < local66; local319++) {
						this.aByteArrayArrayArray7[arg2][local70][local319] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cx", descriptor = "(Lclient!de;Lclient!ahb;IIIIIII)V", line = 212)
	public final void method9463(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(66) int local66;
			@Pc(319) int local319;
			@Pc(70) int local70;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local39 = arg1.method20269();
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local66 = arg1.method20269();
						if (local66 > 0) {
							for (local70 = 0; local70 < local66; local70++) {
								@Pc(85) Class431 local85 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local85.anInt4872 * 2074817827 == 31) {
									@Pc(98) Class620 local98 = Class16.aClass616_3.method33684(arg1.method20271());
									local85.method27950(local98.anInt5570 * -402520065, local98.anInt5571 * 372796923, local98.anInt5568 * 1280948631, local98.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(123) Class3_Sub15 local123 = local85.aClass3_Sub15_3;
									local129 = local123.method11280() >> 9;
									local135 = local123.method11282() >> 9;
									if (arg5 == local85.anInt4887 * -180767789 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class242.method24749(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local193 = (arg4 << 9) + Class242.method24750(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
											local123.method11286(local175, this.anIntArrayArrayArray14[arg5][local129][local135] - local123.method11281(), local193);
											this.aClass438_6.method28185(local85);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local66 = 0; local66 < 4; local66++) {
							@Pc(306) byte local306 = arg1.method20390();
							@Pc(323) int local323;
							if (local306 == 0 && this.aByteArrayArrayArray7[arg2] != null) {
								if (local66 <= arg5) {
									local319 = arg3;
									local323 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local319 = 0;
									} else if (arg3 >= this.anInt1055 * -576668841) {
										local319 = this.anInt1055 * -576668841;
									}
									if (local323 < 0) {
										local323 = 0;
									} else if (local323 >= this.anInt1055 * -576668841) {
										local323 = this.anInt1055 * -576668841;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1056 * 1605649813) {
										local129 = this.anInt1056 * 1605649813;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1056 * 1605649813) {
										local135 = this.anInt1056 * 1605649813;
									}
									while (local319 < local323) {
										while (local129 < local135) {
											this.aByteArrayArrayArray7[arg2][local319][local129] = 0;
											local129++;
										}
										local319++;
									}
								}
							} else if (local306 == 1) {
								if (this.aByteArrayArrayArray7[arg2] == null) {
									this.aByteArrayArrayArray7[arg2] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local319 = 0; local319 < 64; local319 += 4) {
									for (local323 = 0; local323 < 64; local323 += 4) {
										@Pc(452) byte local452 = arg1.method20390();
										if (local66 <= arg5) {
											for (local135 = local319; local135 < local319 + 4; local135++) {
												for (local175 = local323; local175 < local323 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class77.method21572(local135 & 0x7, local175 & 0x7, arg8);
														@Pc(509) int local509 = arg4 + Class43.method9506(local135 & 0x7, local175 & 0x7, arg8);
														if (local193 >= 0 && local193 < this.anInt1055 * -576668841 && local509 >= 0 && local509 < this.anInt1056 * 1605649813) {
															this.aByteArrayArrayArray7[arg2][local193][local509] = local452;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local306 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			if (local13 != null) {
				this.aClass479_1.method28875(arg3 >> 3, arg4 >> 3, local13);
			}
			Class273.method25347(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray7 != null && this.aByteArrayArrayArray7[arg2] != null) {
				local39 = arg3 + 7;
				local66 = arg4 + 7;
				for (local70 = arg3; local70 < local39; local70++) {
					for (local319 = arg4; local319 < local66; local319++) {
						this.aByteArrayArrayArray7[arg2][local70][local319] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cy", descriptor = "(Lclient!de;Lclient!ahb;IIIIIII)V", line = 212)
	public final void method9464(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(66) int local66;
			@Pc(319) int local319;
			@Pc(70) int local70;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local39 = arg1.method20269();
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local66 = arg1.method20269();
						if (local66 > 0) {
							for (local70 = 0; local70 < local66; local70++) {
								@Pc(85) Class431 local85 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local85.anInt4872 * 2074817827 == 31) {
									@Pc(98) Class620 local98 = Class16.aClass616_3.method33684(arg1.method20271());
									local85.method27950(local98.anInt5570 * -402520065, local98.anInt5571 * 372796923, local98.anInt5568 * 1280948631, local98.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(123) Class3_Sub15 local123 = local85.aClass3_Sub15_3;
									local129 = local123.method11280() >> 9;
									local135 = local123.method11282() >> 9;
									if (arg5 == local85.anInt4887 * -180767789 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class242.method24749(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local193 = (arg4 << 9) + Class242.method24750(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
											local123.method11286(local175, this.anIntArrayArrayArray14[arg5][local129][local135] - local123.method11281(), local193);
											this.aClass438_6.method28185(local85);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local66 = 0; local66 < 4; local66++) {
							@Pc(306) byte local306 = arg1.method20390();
							@Pc(323) int local323;
							if (local306 == 0 && this.aByteArrayArrayArray7[arg2] != null) {
								if (local66 <= arg5) {
									local319 = arg3;
									local323 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local319 = 0;
									} else if (arg3 >= this.anInt1055 * -576668841) {
										local319 = this.anInt1055 * -576668841;
									}
									if (local323 < 0) {
										local323 = 0;
									} else if (local323 >= this.anInt1055 * -576668841) {
										local323 = this.anInt1055 * -576668841;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1056 * 1605649813) {
										local129 = this.anInt1056 * 1605649813;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1056 * 1605649813) {
										local135 = this.anInt1056 * 1605649813;
									}
									while (local319 < local323) {
										while (local129 < local135) {
											this.aByteArrayArrayArray7[arg2][local319][local129] = 0;
											local129++;
										}
										local319++;
									}
								}
							} else if (local306 == 1) {
								if (this.aByteArrayArrayArray7[arg2] == null) {
									this.aByteArrayArrayArray7[arg2] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local319 = 0; local319 < 64; local319 += 4) {
									for (local323 = 0; local323 < 64; local323 += 4) {
										@Pc(452) byte local452 = arg1.method20390();
										if (local66 <= arg5) {
											for (local135 = local319; local135 < local319 + 4; local135++) {
												for (local175 = local323; local175 < local323 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class77.method21572(local135 & 0x7, local175 & 0x7, arg8);
														@Pc(509) int local509 = arg4 + Class43.method9506(local135 & 0x7, local175 & 0x7, arg8);
														if (local193 >= 0 && local193 < this.anInt1055 * -576668841 && local509 >= 0 && local509 < this.anInt1056 * 1605649813) {
															this.aByteArrayArrayArray7[arg2][local193][local509] = local452;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local306 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			if (local13 != null) {
				this.aClass479_1.method28875(arg3 >> 3, arg4 >> 3, local13);
			}
			Class273.method25347(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray7 != null && this.aByteArrayArrayArray7[arg2] != null) {
				local39 = arg3 + 7;
				local66 = arg4 + 7;
				for (local70 = arg3; local70 < local39; local70++) {
					for (local319 = arg4; local319 < local66; local319++) {
						this.aByteArrayArrayArray7[arg2][local70][local319] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "ct", descriptor = "(Lclient!de;Lclient!ahb;IIIIIII)V", line = 212)
	public final void method9469(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean220) {
			return;
		}
		arg1.anInt2803 += 1238091944;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class480 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(66) int local66;
			@Pc(319) int local319;
			@Pc(70) int local70;
			while (arg1.anInt2803 * 62066237 < arg1.aByteArray51.length) {
				local39 = arg1.method20269();
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local66 = arg1.method20269();
						if (local66 > 0) {
							for (local70 = 0; local70 < local66; local70++) {
								@Pc(85) Class431 local85 = new Class431(arg0, this.aClass438_6.anInt4895 * 1563265935, arg1, 2);
								if (local85.anInt4872 * 2074817827 == 31) {
									@Pc(98) Class620 local98 = Class16.aClass616_3.method33684(arg1.method20271());
									local85.method27950(local98.anInt5570 * -402520065, local98.anInt5571 * 372796923, local98.anInt5568 * 1280948631, local98.anInt5569 * 150172295);
								}
								if (arg0.method17023() > 0) {
									@Pc(123) Class3_Sub15 local123 = local85.aClass3_Sub15_3;
									local129 = local123.method11280() >> 9;
									local135 = local123.method11282() >> 9;
									if (arg5 == local85.anInt4887 * -180767789 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class242.method24749(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local193 = (arg4 << 9) + Class242.method24750(local123.method11280() & 0xFFF, local123.method11282() & 0xFFF, arg8);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1055 * -576668841 && local135 < this.anInt1056 * 1605649813) {
											local123.method11286(local175, this.anIntArrayArrayArray14[arg5][local129][local135] - local123.method11281(), local193);
											this.aClass438_6.method28185(local85);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28934(arg1);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28935(arg1);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class480();
						}
						local13.method28937(arg1, this.aClass479_1);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray7 == null) {
							this.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local66 = 0; local66 < 4; local66++) {
							@Pc(306) byte local306 = arg1.method20390();
							@Pc(323) int local323;
							if (local306 == 0 && this.aByteArrayArrayArray7[arg2] != null) {
								if (local66 <= arg5) {
									local319 = arg3;
									local323 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local319 = 0;
									} else if (arg3 >= this.anInt1055 * -576668841) {
										local319 = this.anInt1055 * -576668841;
									}
									if (local323 < 0) {
										local323 = 0;
									} else if (local323 >= this.anInt1055 * -576668841) {
										local323 = this.anInt1055 * -576668841;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1056 * 1605649813) {
										local129 = this.anInt1056 * 1605649813;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1056 * 1605649813) {
										local135 = this.anInt1056 * 1605649813;
									}
									while (local319 < local323) {
										while (local129 < local135) {
											this.aByteArrayArrayArray7[arg2][local319][local129] = 0;
											local129++;
										}
										local319++;
									}
								}
							} else if (local306 == 1) {
								if (this.aByteArrayArrayArray7[arg2] == null) {
									this.aByteArrayArrayArray7[arg2] = new byte[this.anInt1055 * -576668841 + 1][this.anInt1056 * 1605649813 + 1];
								}
								for (local319 = 0; local319 < 64; local319 += 4) {
									for (local323 = 0; local323 < 64; local323 += 4) {
										@Pc(452) byte local452 = arg1.method20390();
										if (local66 <= arg5) {
											for (local135 = local319; local135 < local319 + 4; local135++) {
												for (local175 = local323; local175 < local323 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class77.method21572(local135 & 0x7, local175 & 0x7, arg8);
														@Pc(509) int local509 = arg4 + Class43.method9506(local135 & 0x7, local175 & 0x7, arg8);
														if (local193 >= 0 && local193 < this.anInt1055 * -576668841 && local509 >= 0 && local509 < this.anInt1056 * 1605649813) {
															this.aByteArrayArrayArray7[arg2][local193][local509] = local452;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local306 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class480(arg1, this.aClass479_1);
				} else {
					local13.method28933(arg1, this.aClass479_1);
				}
			}
			if (local13 != null) {
				this.aClass479_1.method28875(arg3 >> 3, arg4 >> 3, local13);
			}
			Class273.method25347(arg3 >> 3, arg4 >> 3, local15);
			if (!local11 && this.aByteArrayArrayArray7 != null && this.aByteArrayArrayArray7[arg2] != null) {
				local39 = arg3 + 7;
				local66 = arg4 + 7;
				for (local70 = arg3; local70 < local39; local70++) {
					for (local319 = arg4; local319 < local66; local319++) {
						this.aByteArrayArrayArray7[arg2][local70][local319] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cz", descriptor = "(Lclient!sj;[BIIIILclient!uq;Lclient!uq;)I", line = 333)
	public static final int method9455(@OriginalArg(0) Class457 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class510 arg6, @OriginalArg(7) Class510 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(arg1);
		@Pc(8) int local8 = -1;
		label65: while (true) {
			@Pc(12) int local12 = local6.method20290();
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(29) int local29;
				while (!local23) {
					local29 = local6.method20334();
					if (local29 == 0) {
						continue label65;
					}
					local21 += local29 - 1;
					@Pc(56) int local56 = local21 & 0x3F;
					@Pc(62) int local62 = local21 >> 6 & 0x3F;
					@Pc(68) int local68 = local6.method20269() >> 2;
					@Pc(72) int local72 = local68 & 0x3;
					@Pc(76) int local76 = local68 >> 2;
					@Pc(80) int local80 = local62 + arg2;
					@Pc(84) int local84 = arg3 + local56;
					@Pc(89) Class467 local89 = arg0.method28510(local8);
					@Pc(98) int local98;
					@Pc(103) int local103;
					if ((local72 & 0x1) == 0) {
						local98 = local89.anInt5080 * -1872348475;
						local103 = local89.anInt5113 * 1824726069;
					} else {
						local98 = local89.anInt5113 * 1824726069;
						local103 = local89.anInt5080 * -1872348475;
					}
					if (local80 < arg4 && local84 < arg5 && local98 + local80 >= 0 && local84 + local103 >= 0 && (Class456.aClass456_23.anInt5061 * 821735799 != local76 || Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local89.anInt5082 * 1242646151 != 0 || local89.anInt5081 * -1439129705 == 1 || local89.aBoolean785)) {
						if (!local89.method28678(arg7)) {
							arg6.anInt5258 = local8 * 1831444979;
							local1++;
						}
						local23 = true;
					}
				}
				local29 = local6.method20334();
				if (local29 == 0) {
					break;
				}
				local6.method20269();
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cb", descriptor = "(Lclient!sj;[BIIIILclient!uq;Lclient!uq;)I", line = 333)
	public static final int method9465(@OriginalArg(0) Class457 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class510 arg6, @OriginalArg(7) Class510 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(arg1);
		@Pc(8) int local8 = -1;
		label65: while (true) {
			@Pc(12) int local12 = local6.method20290();
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(29) int local29;
				while (!local23) {
					local29 = local6.method20334();
					if (local29 == 0) {
						continue label65;
					}
					local21 += local29 - 1;
					@Pc(56) int local56 = local21 & 0x3F;
					@Pc(62) int local62 = local21 >> 6 & 0x3F;
					@Pc(68) int local68 = local6.method20269() >> 2;
					@Pc(72) int local72 = local68 & 0x3;
					@Pc(76) int local76 = local68 >> 2;
					@Pc(80) int local80 = local62 + arg2;
					@Pc(84) int local84 = arg3 + local56;
					@Pc(89) Class467 local89 = arg0.method28510(local8);
					@Pc(98) int local98;
					@Pc(103) int local103;
					if ((local72 & 0x1) == 0) {
						local98 = local89.anInt5080 * -1872348475;
						local103 = local89.anInt5113 * 1824726069;
					} else {
						local98 = local89.anInt5113 * 1824726069;
						local103 = local89.anInt5080 * -1872348475;
					}
					if (local80 < arg4 && local84 < arg5 && local98 + local80 >= 0 && local84 + local103 >= 0 && (Class456.aClass456_23.anInt5061 * 821735799 != local76 || Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local89.anInt5082 * 1242646151 != 0 || local89.anInt5081 * -1439129705 == 1 || local89.aBoolean785)) {
						if (!local89.method28678(arg7)) {
							arg6.anInt5258 = local8 * 1831444979;
							local1++;
						}
						local23 = true;
					}
				}
				local29 = local6.method20334();
				if (local29 == 0) {
					break;
				}
				local6.method20269();
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cn", descriptor = "(Lclient!sj;II)Z", line = 385)
	static final boolean method9467(@OriginalArg(0) Class457 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = arg0.method28510(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local4.method28691(arg2);
	}

	@OriginalMember(owner = "client!aeu", name = "co", descriptor = "(Lclient!sj;II)Z", line = 385)
	static final boolean method9468(@OriginalArg(0) Class457 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = arg0.method28510(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local4.method28691(arg2);
	}

	@OriginalMember(owner = "client!aeu", name = "ch", descriptor = "(Lclient!sj;II)Z", line = 385)
	static final boolean method9470(@OriginalArg(0) Class457 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = arg0.method28510(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local4.method28691(arg2);
	}

	@OriginalMember(owner = "client!aeu", name = "cd", descriptor = "(Lclient!sj;II)Z", line = 385)
	static final boolean method9473(@OriginalArg(0) Class457 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = arg0.method28510(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local4.method28691(arg2);
	}

	@OriginalMember(owner = "client!aeu", name = "ck", descriptor = "(Lclient!de;[BIII)V", line = 392)
	public final void method9451(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(46) int local46;
				@Pc(54) int local54;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(106) int local106;
				do {
					@Pc(102) int local102;
					do {
						do {
							do {
								do {
									@Pc(23) int local23 = local4.method20334();
									if (local23 == 0) {
										continue label66;
									}
									local19 += local23 - 1;
									@Pc(36) int local36 = local19 & 0x3F;
									@Pc(42) int local42 = local19 >> 6 & 0x3F;
									local46 = local19 >> 12;
									@Pc(50) int local50 = local4.method20269();
									local54 = local50 >> 2;
									local58 = local50 & 0x3;
									local62 = arg2 + local42;
									local66 = arg3 + local36;
									@Pc(72) Class467 local72 = this.aClass457_1.method28510(local6);
									@Pc(82) int local82;
									@Pc(87) int local87;
									if ((local58 & 0x1) == 0) {
										local82 = local72.anInt5080 * -1872348475;
										local87 = local72.anInt5113 * 1824726069;
									} else {
										local82 = local72.anInt5113 * 1824726069;
										local87 = local72.anInt5080 * -1872348475;
									}
									local102 = local62 + local82;
									local106 = local66 + local87;
								} while (local62 >= this.anInt1055 * -576668841);
							} while (local66 >= this.anInt1056 * 1605649813);
						} while (local102 <= 0);
					} while (local106 <= 0);
				} while (Class456.aClass456_21.anInt5061 * 821735799 != local54 && Class456.aClass456_22.anInt5061 * 821735799 != local54 && (local62 <= 0 || local66 <= 0 || local62 >= this.anInt1055 * -576668841 - 1 || local66 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, local46, local46, local62, local66, local6, local58, local54, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "ca", descriptor = "(Lclient!de;[BII)V", line = 392)
	public final void method9466(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(46) int local46;
				@Pc(54) int local54;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(106) int local106;
				do {
					@Pc(102) int local102;
					do {
						do {
							do {
								do {
									@Pc(23) int local23 = local4.method20334();
									if (local23 == 0) {
										continue label66;
									}
									local19 += local23 - 1;
									@Pc(36) int local36 = local19 & 0x3F;
									@Pc(42) int local42 = local19 >> 6 & 0x3F;
									local46 = local19 >> 12;
									@Pc(50) int local50 = local4.method20269();
									local54 = local50 >> 2;
									local58 = local50 & 0x3;
									local62 = arg2 + local42;
									local66 = arg3 + local36;
									@Pc(72) Class467 local72 = this.aClass457_1.method28510(local6);
									@Pc(82) int local82;
									@Pc(87) int local87;
									if ((local58 & 0x1) == 0) {
										local82 = local72.anInt5080 * -1872348475;
										local87 = local72.anInt5113 * 1824726069;
									} else {
										local82 = local72.anInt5113 * 1824726069;
										local87 = local72.anInt5080 * -1872348475;
									}
									local102 = local62 + local82;
									local106 = local66 + local87;
								} while (local62 >= this.anInt1055 * -576668841);
							} while (local66 >= this.anInt1056 * 1605649813);
						} while (local102 <= 0);
					} while (local106 <= 0);
				} while (Class456.aClass456_21.anInt5061 * 821735799 != local54 && Class456.aClass456_22.anInt5061 * 821735799 != local54 && (local62 <= 0 || local66 <= 0 || local62 >= this.anInt1055 * -576668841 - 1 || local66 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, local46, local46, local62, local66, local6, local58, local54, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "ci", descriptor = "(Lclient!de;[BII)V", line = 392)
	public final void method9471(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(46) int local46;
				@Pc(54) int local54;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(106) int local106;
				do {
					@Pc(102) int local102;
					do {
						do {
							do {
								do {
									@Pc(23) int local23 = local4.method20334();
									if (local23 == 0) {
										continue label66;
									}
									local19 += local23 - 1;
									@Pc(36) int local36 = local19 & 0x3F;
									@Pc(42) int local42 = local19 >> 6 & 0x3F;
									local46 = local19 >> 12;
									@Pc(50) int local50 = local4.method20269();
									local54 = local50 >> 2;
									local58 = local50 & 0x3;
									local62 = arg2 + local42;
									local66 = arg3 + local36;
									@Pc(72) Class467 local72 = this.aClass457_1.method28510(local6);
									@Pc(82) int local82;
									@Pc(87) int local87;
									if ((local58 & 0x1) == 0) {
										local82 = local72.anInt5080 * -1872348475;
										local87 = local72.anInt5113 * 1824726069;
									} else {
										local82 = local72.anInt5113 * 1824726069;
										local87 = local72.anInt5080 * -1872348475;
									}
									local102 = local62 + local82;
									local106 = local66 + local87;
								} while (local62 >= this.anInt1055 * -576668841);
							} while (local66 >= this.anInt1056 * 1605649813);
						} while (local102 <= 0);
					} while (local106 <= 0);
				} while (Class456.aClass456_21.anInt5061 * 821735799 != local54 && Class456.aClass456_22.anInt5061 * 821735799 != local54 && (local62 <= 0 || local66 <= 0 || local62 >= this.anInt1055 * -576668841 - 1 || local66 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, local46, local46, local62, local66, local6, local58, local54, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cm", descriptor = "(Lclient!de;[BIIIIIIIS)V", line = 434)
	public final void method9452(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(131) int local131;
				@Pc(152) int local152;
				@Pc(160) int local160;
				do {
					@Pc(156) int local156;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									@Pc(43) int local43;
									do {
										do {
											do {
												@Pc(47) int local47;
												do {
													do {
														@Pc(24) int local24 = local4.method20334();
														if (local24 == 0) {
															continue label91;
														}
														local20 += local24 - 1;
														local37 = local20 & 0x3F;
														local43 = local20 >> 6 & 0x3F;
														local47 = local20 >> 12;
														@Pc(51) int local51 = local4.method20269();
														local55 = local51 >> 2;
														local59 = local51 & 0x3;
													} while (arg5 != local47);
												} while (local43 < arg6);
											} while (local43 >= arg6 + 8);
										} while (local37 < arg7);
									} while (local37 >= arg7 + 8);
									@Pc(84) Class467 local84 = this.aClass457_1.method28510(local6);
									@Pc(94) int local94;
									@Pc(99) int local99;
									if ((local59 & 0x1) == 0) {
										local94 = local84.anInt5080 * -1872348475;
										local99 = local84.anInt5113 * 1824726069;
									} else {
										local94 = local84.anInt5113 * 1824726069;
										local99 = local84.anInt5080 * -1872348475;
									}
									local131 = arg3 + Class145.method23073(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local152 = arg4 + Class378.method27249(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local156 = local94 + local131;
									local160 = local99 + local152;
								} while (local131 >= this.anInt1055 * -576668841);
							} while (local152 >= this.anInt1056 * 1605649813);
						} while (local156 <= 0);
					} while (local160 <= 0);
				} while (local55 != Class456.aClass456_21.anInt5061 * 821735799 && Class456.aClass456_22.anInt5061 * 821735799 != local55 && (local131 <= 0 || local152 <= 0 || local131 >= this.anInt1055 * -576668841 - 1 || local152 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, arg2, arg2, local131, local152, local6, local59 + arg8 & 0x3, local55, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "ce", descriptor = "(Lclient!de;[BIIIIIII)V", line = 434)
	public final void method9453(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(131) int local131;
				@Pc(152) int local152;
				@Pc(160) int local160;
				do {
					@Pc(156) int local156;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									@Pc(43) int local43;
									do {
										do {
											do {
												@Pc(47) int local47;
												do {
													do {
														@Pc(24) int local24 = local4.method20334();
														if (local24 == 0) {
															continue label91;
														}
														local20 += local24 - 1;
														local37 = local20 & 0x3F;
														local43 = local20 >> 6 & 0x3F;
														local47 = local20 >> 12;
														@Pc(51) int local51 = local4.method20269();
														local55 = local51 >> 2;
														local59 = local51 & 0x3;
													} while (arg5 != local47);
												} while (local43 < arg6);
											} while (local43 >= arg6 + 8);
										} while (local37 < arg7);
									} while (local37 >= arg7 + 8);
									@Pc(84) Class467 local84 = this.aClass457_1.method28510(local6);
									@Pc(94) int local94;
									@Pc(99) int local99;
									if ((local59 & 0x1) == 0) {
										local94 = local84.anInt5080 * -1872348475;
										local99 = local84.anInt5113 * 1824726069;
									} else {
										local94 = local84.anInt5113 * 1824726069;
										local99 = local84.anInt5080 * -1872348475;
									}
									local131 = arg3 + Class145.method23073(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local152 = arg4 + Class378.method27249(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local156 = local94 + local131;
									local160 = local99 + local152;
								} while (local131 >= this.anInt1055 * -576668841);
							} while (local152 >= this.anInt1056 * 1605649813);
						} while (local156 <= 0);
					} while (local160 <= 0);
				} while (local55 != Class456.aClass456_21.anInt5061 * 821735799 && Class456.aClass456_22.anInt5061 * 821735799 != local55 && (local131 <= 0 || local152 <= 0 || local131 >= this.anInt1055 * -576668841 - 1 || local152 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, arg2, arg2, local131, local152, local6, local59 + arg8 & 0x3, local55, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cw", descriptor = "(Lclient!de;[BIIIIIII)V", line = 434)
	public final void method9475(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(131) int local131;
				@Pc(152) int local152;
				@Pc(160) int local160;
				do {
					@Pc(156) int local156;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									@Pc(43) int local43;
									do {
										do {
											do {
												@Pc(47) int local47;
												do {
													do {
														@Pc(24) int local24 = local4.method20334();
														if (local24 == 0) {
															continue label91;
														}
														local20 += local24 - 1;
														local37 = local20 & 0x3F;
														local43 = local20 >> 6 & 0x3F;
														local47 = local20 >> 12;
														@Pc(51) int local51 = local4.method20269();
														local55 = local51 >> 2;
														local59 = local51 & 0x3;
													} while (arg5 != local47);
												} while (local43 < arg6);
											} while (local43 >= arg6 + 8);
										} while (local37 < arg7);
									} while (local37 >= arg7 + 8);
									@Pc(84) Class467 local84 = this.aClass457_1.method28510(local6);
									@Pc(94) int local94;
									@Pc(99) int local99;
									if ((local59 & 0x1) == 0) {
										local94 = local84.anInt5080 * -1872348475;
										local99 = local84.anInt5113 * 1824726069;
									} else {
										local94 = local84.anInt5113 * 1824726069;
										local99 = local84.anInt5080 * -1872348475;
									}
									local131 = arg3 + Class145.method23073(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local152 = arg4 + Class378.method27249(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local156 = local94 + local131;
									local160 = local99 + local152;
								} while (local131 >= this.anInt1055 * -576668841);
							} while (local152 >= this.anInt1056 * 1605649813);
						} while (local156 <= 0);
					} while (local160 <= 0);
				} while (local55 != Class456.aClass456_21.anInt5061 * 821735799 && Class456.aClass456_22.anInt5061 * 821735799 != local55 && (local131 <= 0 || local152 <= 0 || local131 >= this.anInt1055 * -576668841 - 1 || local152 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, arg2, arg2, local131, local152, local6, local59 + arg8 & 0x3, local55, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cr", descriptor = "(Lclient!de;[BIIIIIII)V", line = 434)
	public final void method9476(@OriginalArg(0) Class21 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method20290();
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(131) int local131;
				@Pc(152) int local152;
				@Pc(160) int local160;
				do {
					@Pc(156) int local156;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									@Pc(43) int local43;
									do {
										do {
											do {
												@Pc(47) int local47;
												do {
													do {
														@Pc(24) int local24 = local4.method20334();
														if (local24 == 0) {
															continue label91;
														}
														local20 += local24 - 1;
														local37 = local20 & 0x3F;
														local43 = local20 >> 6 & 0x3F;
														local47 = local20 >> 12;
														@Pc(51) int local51 = local4.method20269();
														local55 = local51 >> 2;
														local59 = local51 & 0x3;
													} while (arg5 != local47);
												} while (local43 < arg6);
											} while (local43 >= arg6 + 8);
										} while (local37 < arg7);
									} while (local37 >= arg7 + 8);
									@Pc(84) Class467 local84 = this.aClass457_1.method28510(local6);
									@Pc(94) int local94;
									@Pc(99) int local99;
									if ((local59 & 0x1) == 0) {
										local94 = local84.anInt5080 * -1872348475;
										local99 = local84.anInt5113 * 1824726069;
									} else {
										local94 = local84.anInt5113 * 1824726069;
										local99 = local84.anInt5080 * -1872348475;
									}
									local131 = arg3 + Class145.method23073(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local152 = arg4 + Class378.method27249(local43 & 0x7, local37 & 0x7, arg8, local84.anInt5080 * -1872348475, local84.anInt5113 * 1824726069, local59);
									local156 = local94 + local131;
									local160 = local99 + local152;
								} while (local131 >= this.anInt1055 * -576668841);
							} while (local152 >= this.anInt1056 * 1605649813);
						} while (local156 <= 0);
					} while (local160 <= 0);
				} while (local55 != Class456.aClass456_21.anInt5061 * 821735799 && Class456.aClass456_22.anInt5061 * 821735799 != local55 && (local131 <= 0 || local152 <= 0 || local131 >= this.anInt1055 * -576668841 - 1 || local152 >= this.anInt1056 * 1605649813 - 1));
				this.method9461(arg0, arg2, arg2, local131, local152, local6, local59 + arg8 & 0x3, local55, -1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!aeu", name = "df", descriptor = "(Lclient!de;IIIIIIIII)V", line = 478)
	final void method9459(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1085 * 404001743) {
			this.anInt1085 = arg2 * -128478417;
		}
		@Pc(16) Class467 local16 = this.aClass457_1.method28510(arg5);
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 0 && local16.aBoolean788) {
			return;
		}
		@Pc(36) int local36;
		@Pc(41) int local41;
		if (arg6 == 1 || arg6 == 3) {
			local36 = local16.anInt5113 * 1824726069;
			local41 = local16.anInt5080 * -1872348475;
		} else {
			local36 = local16.anInt5080 * -1872348475;
			local41 = local16.anInt5113 * 1824726069;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local36 + arg3 <= this.anInt1055 * -576668841) {
			local66 = arg3 + (local36 >> 1);
			local74 = (local36 + 1 >> 1) + arg3;
		} else {
			local66 = arg3;
			local74 = arg3 + 1;
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (arg4 + local41 <= this.anInt1056 * 1605649813) {
			local95 = arg4 + (local41 >> 1);
			local103 = arg4 + (local41 + 1 >> 1);
		} else {
			local95 = arg4;
			local103 = arg4 + 1;
		}
		@Pc(116) Class17 local116 = this.aClass438_6.aClass17Array3[arg1];
		@Pc(154) int local154;
		if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
			local154 = local116.method3586(local66, local95) + local116.method3586(local74, local95) + local116.method3586(local66, local103) + local116.method3586(local74, local103) >> 2;
		} else {
			local154 = local116.method3548(local66, local95) + local116.method3548(local74, local95) + local116.method3548(local66, local103) + local116.method3548(local74, local103) >> 2;
		}
		@Pc(189) int local189 = (local36 << 8) + (arg3 << 9);
		@Pc(197) int local197 = (arg4 << 9) + (local41 << 8);
		@Pc(210) boolean local210 = this.aBoolean225 && !this.aBoolean220 && local16.aBoolean780;
		if (local16.method28685()) {
			Class148.method23119(arg2, arg3, arg4, arg6, local16, null, null);
		}
		@Pc(251) boolean local251 = arg8 == -1 && (!local16.method28723() || local16.aBoolean781 && Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 0) && local16.anIntArray464 == null && !local16.aBoolean791 && !local16.aBoolean778;
		if (aBoolean227 && (Class220.method24382(arg7) && local16.anInt5084 * 539036537 != 1 || !(!Class591.method33335(arg7) || local16.anInt5084 * 539036537 != 0))) {
			return;
		}
		if (Class456.aClass456_23.anInt5061 * 821735799 != arg7) {
			@Pc(422) Class26_Sub1_Sub1 local422;
			@Pc(375) Class26_Sub1_Sub1_Sub3 local375;
			if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
				local375 = null;
				@Pc(420) int local420;
				if (local251) {
					@Pc(416) Class26_Sub1_Sub1_Sub3 local416 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, arg4 + local41 - 1, arg7, arg6, local210, local16.aClass449_4 != Class449.aClass449_3);
					local420 = local416.method10450();
					local422 = local416;
					local375 = local416;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, Class449.aClass449_3 != local16.aClass449_4);
					local420 = 15;
				}
				if (this.aClass438_6.method28054(local422, false)) {
					if (local375 != null && local375.method11149()) {
						local375.method11156(arg0);
					}
					if (local16.aBoolean779 && this.aBoolean225) {
						if (local420 > 30) {
							local420 = 30;
						}
						for (@Pc(498) int local498 = 0; local498 <= local36; local498++) {
							for (@Pc(503) int local503 = 0; local503 <= local41; local503++) {
								local116.method3565(local498 + arg3, local503 + arg4, local420);
							}
						}
					}
				}
			} else if (Class591.method33335(arg7) || Class345.method26496(arg7)) {
				if (local251) {
					local375 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, local210, true);
					if (local375.method11149()) {
						local375.method11156(arg0);
					}
					local422 = local375;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass438_6.method28054(local422, false);
				if (this.aBoolean225 && !this.aBoolean220 && Class591.method33335(arg7) && arg7 != Class456.aClass456_13.anInt5061 * 821735799 && arg2 > 0 && local16.anInt5084 * 539036537 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method9454(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4, local210, local116, local36, local41) && !this.method9448(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4)) {
				;
			}
		} else if (Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local16.anInt5082 * 1242646151 != 0 || local16.anInt5081 * -1439129705 == 1 || local16.aBoolean785) {
			@Pc(331) Class26_Sub1_Sub2 local331;
			if (local251) {
				@Pc(321) Class26_Sub1_Sub2_Sub2 local321 = new Class26_Sub1_Sub2_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, local210);
				if (local321.method11149()) {
					local321.method11156(arg0);
				}
				local331 = local321;
			} else {
				local331 = new Class26_Sub1_Sub2_Sub1(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, arg8, arg9);
			}
			this.aClass438_6.method28107(arg2, arg3, arg4, local331);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cj", descriptor = "(Lclient!de;IIIIIIIIII)V", line = 478)
	final void method9461(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1085 * 404001743) {
			this.anInt1085 = arg2 * -128478417;
		}
		@Pc(16) Class467 local16 = this.aClass457_1.method28510(arg5);
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 0 && local16.aBoolean788) {
			return;
		}
		@Pc(36) int local36;
		@Pc(41) int local41;
		if (arg6 == 1 || arg6 == 3) {
			local36 = local16.anInt5113 * 1824726069;
			local41 = local16.anInt5080 * -1872348475;
		} else {
			local36 = local16.anInt5080 * -1872348475;
			local41 = local16.anInt5113 * 1824726069;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local36 + arg3 <= this.anInt1055 * -576668841) {
			local66 = arg3 + (local36 >> 1);
			local74 = (local36 + 1 >> 1) + arg3;
		} else {
			local66 = arg3;
			local74 = arg3 + 1;
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (arg4 + local41 <= this.anInt1056 * 1605649813) {
			local95 = arg4 + (local41 >> 1);
			local103 = arg4 + (local41 + 1 >> 1);
		} else {
			local95 = arg4;
			local103 = arg4 + 1;
		}
		@Pc(116) Class17 local116 = this.aClass438_6.aClass17Array3[arg1];
		@Pc(154) int local154;
		if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
			local154 = local116.method3586(local66, local95) + local116.method3586(local74, local95) + local116.method3586(local66, local103) + local116.method3586(local74, local103) >> 2;
		} else {
			local154 = local116.method3548(local66, local95) + local116.method3548(local74, local95) + local116.method3548(local66, local103) + local116.method3548(local74, local103) >> 2;
		}
		@Pc(189) int local189 = (local36 << 8) + (arg3 << 9);
		@Pc(197) int local197 = (arg4 << 9) + (local41 << 8);
		@Pc(210) boolean local210 = this.aBoolean225 && !this.aBoolean220 && local16.aBoolean780;
		if (local16.method28685()) {
			Class148.method23119(arg2, arg3, arg4, arg6, local16, null, null);
		}
		@Pc(251) boolean local251 = arg8 == -1 && (!local16.method28723() || local16.aBoolean781 && Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 0) && local16.anIntArray464 == null && !local16.aBoolean791 && !local16.aBoolean778;
		if (aBoolean227 && (Class220.method24382(arg7) && local16.anInt5084 * 539036537 != 1 || !(!Class591.method33335(arg7) || local16.anInt5084 * 539036537 != 0))) {
			return;
		}
		if (Class456.aClass456_23.anInt5061 * 821735799 != arg7) {
			@Pc(422) Class26_Sub1_Sub1 local422;
			@Pc(375) Class26_Sub1_Sub1_Sub3 local375;
			if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
				local375 = null;
				@Pc(420) int local420;
				if (local251) {
					@Pc(416) Class26_Sub1_Sub1_Sub3 local416 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, arg4 + local41 - 1, arg7, arg6, local210, local16.aClass449_4 != Class449.aClass449_3);
					local420 = local416.method10450();
					local422 = local416;
					local375 = local416;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, Class449.aClass449_3 != local16.aClass449_4);
					local420 = 15;
				}
				if (this.aClass438_6.method28054(local422, false)) {
					if (local375 != null && local375.method11149()) {
						local375.method11156(arg0);
					}
					if (local16.aBoolean779 && this.aBoolean225) {
						if (local420 > 30) {
							local420 = 30;
						}
						for (@Pc(498) int local498 = 0; local498 <= local36; local498++) {
							for (@Pc(503) int local503 = 0; local503 <= local41; local503++) {
								local116.method3565(local498 + arg3, local503 + arg4, local420);
							}
						}
					}
				}
			} else if (Class591.method33335(arg7) || Class345.method26496(arg7)) {
				if (local251) {
					local375 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, local210, true);
					if (local375.method11149()) {
						local375.method11156(arg0);
					}
					local422 = local375;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass438_6.method28054(local422, false);
				if (this.aBoolean225 && !this.aBoolean220 && Class591.method33335(arg7) && arg7 != Class456.aClass456_13.anInt5061 * 821735799 && arg2 > 0 && local16.anInt5084 * 539036537 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method9454(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4, local210, local116, local36, local41) && !this.method9448(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4)) {
				;
			}
		} else if (Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local16.anInt5082 * 1242646151 != 0 || local16.anInt5081 * -1439129705 == 1 || local16.aBoolean785) {
			@Pc(331) Class26_Sub1_Sub2 local331;
			if (local251) {
				@Pc(321) Class26_Sub1_Sub2_Sub2 local321 = new Class26_Sub1_Sub2_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, local210);
				if (local321.method11149()) {
					local321.method11156(arg0);
				}
				local331 = local321;
			} else {
				local331 = new Class26_Sub1_Sub2_Sub1(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, arg8, arg9);
			}
			this.aClass438_6.method28107(arg2, arg3, arg4, local331);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dv", descriptor = "(Lclient!de;IIIIIIIII)V", line = 478)
	final void method9477(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1085 * 404001743) {
			this.anInt1085 = arg2 * -128478417;
		}
		@Pc(16) Class467 local16 = this.aClass457_1.method28510(arg5);
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 0 && local16.aBoolean788) {
			return;
		}
		@Pc(36) int local36;
		@Pc(41) int local41;
		if (arg6 == 1 || arg6 == 3) {
			local36 = local16.anInt5113 * 1824726069;
			local41 = local16.anInt5080 * -1872348475;
		} else {
			local36 = local16.anInt5080 * -1872348475;
			local41 = local16.anInt5113 * 1824726069;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local36 + arg3 <= this.anInt1055 * -576668841) {
			local66 = arg3 + (local36 >> 1);
			local74 = (local36 + 1 >> 1) + arg3;
		} else {
			local66 = arg3;
			local74 = arg3 + 1;
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (arg4 + local41 <= this.anInt1056 * 1605649813) {
			local95 = arg4 + (local41 >> 1);
			local103 = arg4 + (local41 + 1 >> 1);
		} else {
			local95 = arg4;
			local103 = arg4 + 1;
		}
		@Pc(116) Class17 local116 = this.aClass438_6.aClass17Array3[arg1];
		@Pc(154) int local154;
		if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
			local154 = local116.method3586(local66, local95) + local116.method3586(local74, local95) + local116.method3586(local66, local103) + local116.method3586(local74, local103) >> 2;
		} else {
			local154 = local116.method3548(local66, local95) + local116.method3548(local74, local95) + local116.method3548(local66, local103) + local116.method3548(local74, local103) >> 2;
		}
		@Pc(189) int local189 = (local36 << 8) + (arg3 << 9);
		@Pc(197) int local197 = (arg4 << 9) + (local41 << 8);
		@Pc(210) boolean local210 = this.aBoolean225 && !this.aBoolean220 && local16.aBoolean780;
		if (local16.method28685()) {
			Class148.method23119(arg2, arg3, arg4, arg6, local16, null, null);
		}
		@Pc(251) boolean local251 = arg8 == -1 && (!local16.method28723() || local16.aBoolean781 && Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 0) && local16.anIntArray464 == null && !local16.aBoolean791 && !local16.aBoolean778;
		if (aBoolean227 && (Class220.method24382(arg7) && local16.anInt5084 * 539036537 != 1 || !(!Class591.method33335(arg7) || local16.anInt5084 * 539036537 != 0))) {
			return;
		}
		if (Class456.aClass456_23.anInt5061 * 821735799 != arg7) {
			@Pc(422) Class26_Sub1_Sub1 local422;
			@Pc(375) Class26_Sub1_Sub1_Sub3 local375;
			if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
				local375 = null;
				@Pc(420) int local420;
				if (local251) {
					@Pc(416) Class26_Sub1_Sub1_Sub3 local416 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, arg4 + local41 - 1, arg7, arg6, local210, local16.aClass449_4 != Class449.aClass449_3);
					local420 = local416.method10450();
					local422 = local416;
					local375 = local416;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, Class449.aClass449_3 != local16.aClass449_4);
					local420 = 15;
				}
				if (this.aClass438_6.method28054(local422, false)) {
					if (local375 != null && local375.method11149()) {
						local375.method11156(arg0);
					}
					if (local16.aBoolean779 && this.aBoolean225) {
						if (local420 > 30) {
							local420 = 30;
						}
						for (@Pc(498) int local498 = 0; local498 <= local36; local498++) {
							for (@Pc(503) int local503 = 0; local503 <= local41; local503++) {
								local116.method3565(local498 + arg3, local503 + arg4, local420);
							}
						}
					}
				}
			} else if (Class591.method33335(arg7) || Class345.method26496(arg7)) {
				if (local251) {
					local375 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, local210, true);
					if (local375.method11149()) {
						local375.method11156(arg0);
					}
					local422 = local375;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass438_6.method28054(local422, false);
				if (this.aBoolean225 && !this.aBoolean220 && Class591.method33335(arg7) && arg7 != Class456.aClass456_13.anInt5061 * 821735799 && arg2 > 0 && local16.anInt5084 * 539036537 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method9454(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4, local210, local116, local36, local41) && !this.method9448(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4)) {
				;
			}
		} else if (Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local16.anInt5082 * 1242646151 != 0 || local16.anInt5081 * -1439129705 == 1 || local16.aBoolean785) {
			@Pc(331) Class26_Sub1_Sub2 local331;
			if (local251) {
				@Pc(321) Class26_Sub1_Sub2_Sub2 local321 = new Class26_Sub1_Sub2_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, local210);
				if (local321.method11149()) {
					local321.method11156(arg0);
				}
				local331 = local321;
			} else {
				local331 = new Class26_Sub1_Sub2_Sub1(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, arg8, arg9);
			}
			this.aClass438_6.method28107(arg2, arg3, arg4, local331);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cf", descriptor = "(Lclient!de;IIIIIIIII)V", line = 478)
	final void method9481(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < this.anInt1085 * 404001743) {
			this.anInt1085 = arg2 * -128478417;
		}
		@Pc(16) Class467 local16 = this.aClass457_1.method28510(arg5);
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 0 && local16.aBoolean788) {
			return;
		}
		@Pc(36) int local36;
		@Pc(41) int local41;
		if (arg6 == 1 || arg6 == 3) {
			local36 = local16.anInt5113 * 1824726069;
			local41 = local16.anInt5080 * -1872348475;
		} else {
			local36 = local16.anInt5080 * -1872348475;
			local41 = local16.anInt5113 * 1824726069;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local36 + arg3 <= this.anInt1055 * -576668841) {
			local66 = arg3 + (local36 >> 1);
			local74 = (local36 + 1 >> 1) + arg3;
		} else {
			local66 = arg3;
			local74 = arg3 + 1;
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (arg4 + local41 <= this.anInt1056 * 1605649813) {
			local95 = arg4 + (local41 >> 1);
			local103 = arg4 + (local41 + 1 >> 1);
		} else {
			local95 = arg4;
			local103 = arg4 + 1;
		}
		@Pc(116) Class17 local116 = this.aClass438_6.aClass17Array3[arg1];
		@Pc(154) int local154;
		if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
			local154 = local116.method3586(local66, local95) + local116.method3586(local74, local95) + local116.method3586(local66, local103) + local116.method3586(local74, local103) >> 2;
		} else {
			local154 = local116.method3548(local66, local95) + local116.method3548(local74, local95) + local116.method3548(local66, local103) + local116.method3548(local74, local103) >> 2;
		}
		@Pc(189) int local189 = (local36 << 8) + (arg3 << 9);
		@Pc(197) int local197 = (arg4 << 9) + (local41 << 8);
		@Pc(210) boolean local210 = this.aBoolean225 && !this.aBoolean220 && local16.aBoolean780;
		if (local16.method28685()) {
			Class148.method23119(arg2, arg3, arg4, arg6, local16, null, null);
		}
		@Pc(251) boolean local251 = arg8 == -1 && (!local16.method28723() || local16.aBoolean781 && Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 0) && local16.anIntArray464 == null && !local16.aBoolean791 && !local16.aBoolean778;
		if (aBoolean227 && (Class220.method24382(arg7) && local16.anInt5084 * 539036537 != 1 || !(!Class591.method33335(arg7) || local16.anInt5084 * 539036537 != 0))) {
			return;
		}
		if (Class456.aClass456_23.anInt5061 * 821735799 != arg7) {
			@Pc(422) Class26_Sub1_Sub1 local422;
			@Pc(375) Class26_Sub1_Sub1_Sub3 local375;
			if (Class456.aClass456_21.anInt5061 * 821735799 == arg7 || Class456.aClass456_22.anInt5061 * 821735799 == arg7) {
				local375 = null;
				@Pc(420) int local420;
				if (local251) {
					@Pc(416) Class26_Sub1_Sub1_Sub3 local416 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, arg4 + local41 - 1, arg7, arg6, local210, local16.aClass449_4 != Class449.aClass449_3);
					local420 = local416.method10450();
					local422 = local416;
					local375 = local416;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, local36 + arg3 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, Class449.aClass449_3 != local16.aClass449_4);
					local420 = 15;
				}
				if (this.aClass438_6.method28054(local422, false)) {
					if (local375 != null && local375.method11149()) {
						local375.method11156(arg0);
					}
					if (local16.aBoolean779 && this.aBoolean225) {
						if (local420 > 30) {
							local420 = 30;
						}
						for (@Pc(498) int local498 = 0; local498 <= local36; local498++) {
							for (@Pc(503) int local503 = 0; local503 <= local41; local503++) {
								local116.method3565(local498 + arg3, local503 + arg4, local420);
							}
						}
					}
				}
			} else if (Class591.method33335(arg7) || Class345.method26496(arg7)) {
				if (local251) {
					local375 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, local210, true);
					if (local375.method11149()) {
						local375.method11156(arg0);
					}
					local422 = local375;
				} else {
					local422 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg3, arg3 + local36 - 1, arg4, local41 + arg4 - 1, arg7, arg6, arg8, arg9, true);
				}
				this.aClass438_6.method28054(local422, false);
				if (this.aBoolean225 && !this.aBoolean220 && Class591.method33335(arg7) && arg7 != Class456.aClass456_13.anInt5061 * 821735799 && arg2 > 0 && local16.anInt5084 * 539036537 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method9454(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4, local210, local116, local36, local41) && !this.method9448(arg0, arg7, arg6, local251, local16, arg8, arg9, arg2, arg1, local189, local154, local197, arg3, arg4)) {
				;
			}
		} else if (Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987() != 0 || local16.anInt5082 * 1242646151 != 0 || local16.anInt5081 * -1439129705 == 1 || local16.aBoolean785) {
			@Pc(331) Class26_Sub1_Sub2 local331;
			if (local251) {
				@Pc(321) Class26_Sub1_Sub2_Sub2 local321 = new Class26_Sub1_Sub2_Sub2(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, local210);
				if (local321.method11149()) {
					local321.method11156(arg0);
				}
				local331 = local321;
			} else {
				local331 = new Class26_Sub1_Sub2_Sub1(this.aClass438_6, arg0, this.aClass457_1, local16, arg2, arg1, local189, local154, local197, this.aBoolean220, arg6, arg8, arg9);
			}
			this.aClass438_6.method28107(arg2, arg3, arg4, local331);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cu", descriptor = "(Lclient!de;IIZLclient!su;IIIIIIIIIZLclient!ci;III)Z", line = 579)
	boolean method9454(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class467 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class17 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17) {
		@Pc(52) Class26_Sub1_Sub3 local52;
		if (Class456.aClass456_4.anInt5061 * 821735799 == arg1) {
			@Pc(10) int local10 = arg4.anInt5084 * 539036537;
			if (aBoolean228 && arg4.anInt5084 * 539036537 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(42) Class26_Sub1_Sub3_Sub1 local42 = new Class26_Sub1_Sub3_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg14);
				if (local42.method11149()) {
					local42.method11156(arg0);
				}
				local52 = local42;
			} else {
				local52 = new Class26_Sub1_Sub3_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28062(arg7, arg12, arg13, local52, null);
			if (arg2 == 0) {
				if (this.aBoolean225 && arg4.aBoolean779) {
					arg15.method3565(arg12, arg13, 50);
					arg15.method3565(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean220) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean225 && arg4.aBoolean779) {
					arg15.method3565(arg12, arg13 + 1, 50);
					arg15.method3565(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean220) {
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13 + 1, arg4.anInt5088 * 658386139, -(arg4.anInt5086 * -2013578355));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean225 && arg4.aBoolean779) {
					arg15.method3565(arg12 + 1, arg13, 50);
					arg15.method3565(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean220) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12 + 1, arg13, arg4.anInt5088 * 658386139, -(arg4.anInt5086 * -2013578355));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean225 && arg4.aBoolean779) {
					arg15.method3565(arg12, arg13, 50);
					arg15.method3565(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean220) {
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				}
			}
			if (arg4.anInt5110 * -2004613045 != 64) {
				this.aClass438_6.method28055(arg7, arg12, arg13, arg4.anInt5110 * -2004613045);
			}
			return true;
		}
		@Pc(328) Class26_Sub1_Sub3 local328;
		@Pc(318) Class26_Sub1_Sub3_Sub1 local318;
		if (arg1 == Class456.aClass456_5.anInt5061 * 821735799) {
			if (arg3) {
				local318 = new Class26_Sub1_Sub3_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg14);
				if (local318.method11149()) {
					local318.method11156(arg0);
				}
				local328 = local318;
			} else {
				local328 = new Class26_Sub1_Sub3_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28062(arg7, arg12, arg13, local328, null);
			if (arg4.aBoolean779 && this.aBoolean225) {
				if (arg2 == 0) {
					arg15.method3565(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method3565(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method3565(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method3565(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class456.aClass456_3.anInt5061 * 821735799) {
			@Pc(422) int local422 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(446) Class26_Sub1_Sub3_Sub1 local446 = new Class26_Sub1_Sub3_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2 + 4, arg14);
				@Pc(466) Class26_Sub1_Sub3_Sub1 local466 = new Class26_Sub1_Sub3_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, local422, arg14);
				if (local446.method11149()) {
					local446.method11156(arg0);
				}
				if (local466.method11149()) {
					local466.method11156(arg0);
				}
				local328 = local446;
				local52 = local466;
			} else {
				local328 = new Class26_Sub1_Sub3_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2 + 4, arg5, arg6);
				local52 = new Class26_Sub1_Sub3_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, local422, arg5, arg6);
			}
			this.aClass438_6.method28062(arg7, arg12, arg13, local328, local52);
			if ((arg4.anInt5084 * 539036537 == 1 || aBoolean228 && arg4.anInt5084 * 539036537 == -1) && !this.aBoolean220) {
				if (arg2 == 0) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13 + 1, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				} else if (arg2 == 1) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12 + 1, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13 + 1, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				} else if (arg2 == 2) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12 + 1, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				} else if (arg2 == 3) {
					this.aClass438_6.aClass444_1.method28276(1, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
					this.aClass438_6.aClass444_1.method28276(2, arg7, arg12, arg13, arg4.anInt5088 * 658386139, arg4.anInt5086 * -2013578355);
				}
			}
			if (arg4.anInt5110 * -2004613045 != 64) {
				this.aClass438_6.method28055(arg7, arg12, arg13, arg4.anInt5110 * -2004613045);
			}
			return true;
		} else if (arg1 == Class456.aClass456_14.anInt5061 * 821735799) {
			if (arg3) {
				local318 = new Class26_Sub1_Sub3_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg14);
				if (local318.method11149()) {
					local318.method11156(arg0);
				}
				local328 = local318;
			} else {
				local328 = new Class26_Sub1_Sub3_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28062(arg7, arg12, arg13, local328, null);
			if (arg4.aBoolean779 && this.aBoolean225) {
				if (arg2 == 0) {
					arg15.method3565(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method3565(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method3565(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method3565(arg12, arg13, 50);
				}
			}
			return true;
		} else if (Class456.aClass456_6.anInt5061 * 821735799 == arg1) {
			@Pc(889) Class26_Sub1_Sub1 local889;
			if (arg3) {
				@Pc(879) Class26_Sub1_Sub1_Sub3 local879 = new Class26_Sub1_Sub1_Sub3(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true);
				if (local879.method11149()) {
					local879.method11156(arg0);
				}
				local889 = local879;
			} else {
				local889 = new Class26_Sub1_Sub1_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true);
			}
			this.aClass438_6.method28054(local889, false);
			if (arg4.anInt5084 * 539036537 == 1 && !this.aBoolean220) {
				@Pc(946) byte local946;
				if ((arg2 & 0x1) == 0) {
					local946 = 8;
				} else {
					local946 = 16;
				}
				this.aClass438_6.aClass444_1.method28276(local946, arg7, arg12, arg13, arg4.anInt5088 * 658386139, 0);
			}
			if (arg4.anInt5110 * -2004613045 != 64) {
				this.aClass438_6.method28055(arg7, arg12, arg13, arg4.anInt5110 * -2004613045);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cv", descriptor = "(Lclient!de;IIZLclient!su;IIIIIIIIIS)Z", line = 715)
	boolean method9448(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class467 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class26_Sub1_Sub4 local38;
		if (Class456.aClass456_7.anInt5061 * 821735799 == arg1) {
			if (arg3) {
				@Pc(28) Class26_Sub1_Sub4_Sub2 local28 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2);
				if (local28.method11149()) {
					local28.method11156(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface43 local90;
		@Pc(137) Class26_Sub1_Sub4_Sub2 local137;
		if (arg1 == Class456.aClass456_8.anInt5061 * 821735799) {
			local81 = 65;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray160[arg2], anIntArray161[arg2] * local81, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (Class456.aClass456_9.anInt5061 * 821735799 == arg1) {
			local81 = 33;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2 + 4);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray162[arg2], local81 * anIntArray159[arg2], arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_10.anInt5061 * 821735799) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class26_Sub1_Sub4_Sub2 local350 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4);
				if (local350.method11149()) {
					local350.method11156(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_11.anInt5061 * 821735799) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface43 local420 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = this.aClass457_1.method28510(local420.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			@Pc(513) Class26_Sub1_Sub4 local513;
			if (arg3) {
				@Pc(470) Class26_Sub1_Sub4_Sub2 local470 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local411 * anIntArray162[arg2], local411 * anIntArray159[arg2], arg1, arg2 + 4);
				@Pc(493) Class26_Sub1_Sub4_Sub2 local493 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4);
				if (local470.method11149()) {
					local470.method11156(arg0);
				}
				if (local493.method11149()) {
					local493.method11156(arg0);
				}
				local38 = local470;
				local513 = local493;
			} else {
				@Pc(547) Class26_Sub1_Sub4_Sub1 local547 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray162[arg2] * local411, anIntArray159[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(572) Class26_Sub1_Sub4_Sub1 local572 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local547;
				local513 = local572;
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, local513);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "db", descriptor = "(Lclient!de;IIZLclient!su;IIIIIIIII)Z", line = 715)
	boolean method9462(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class467 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class26_Sub1_Sub4 local38;
		if (Class456.aClass456_7.anInt5061 * 821735799 == arg1) {
			if (arg3) {
				@Pc(28) Class26_Sub1_Sub4_Sub2 local28 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2);
				if (local28.method11149()) {
					local28.method11156(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface43 local90;
		@Pc(137) Class26_Sub1_Sub4_Sub2 local137;
		if (arg1 == Class456.aClass456_8.anInt5061 * 821735799) {
			local81 = 65;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray160[arg2], anIntArray161[arg2] * local81, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (Class456.aClass456_9.anInt5061 * 821735799 == arg1) {
			local81 = 33;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2 + 4);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray162[arg2], local81 * anIntArray159[arg2], arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_10.anInt5061 * 821735799) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class26_Sub1_Sub4_Sub2 local350 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4);
				if (local350.method11149()) {
					local350.method11156(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_11.anInt5061 * 821735799) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface43 local420 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = this.aClass457_1.method28510(local420.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			@Pc(513) Class26_Sub1_Sub4 local513;
			if (arg3) {
				@Pc(470) Class26_Sub1_Sub4_Sub2 local470 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local411 * anIntArray162[arg2], local411 * anIntArray159[arg2], arg1, arg2 + 4);
				@Pc(493) Class26_Sub1_Sub4_Sub2 local493 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4);
				if (local470.method11149()) {
					local470.method11156(arg0);
				}
				if (local493.method11149()) {
					local493.method11156(arg0);
				}
				local38 = local470;
				local513 = local493;
			} else {
				@Pc(547) Class26_Sub1_Sub4_Sub1 local547 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray162[arg2] * local411, anIntArray159[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(572) Class26_Sub1_Sub4_Sub1 local572 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local547;
				local513 = local572;
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, local513);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dh", descriptor = "(Lclient!de;IIZLclient!su;IIIIIIIII)Z", line = 715)
	boolean method9479(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class467 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(38) Class26_Sub1_Sub4 local38;
		if (Class456.aClass456_7.anInt5061 * 821735799 == arg1) {
			if (arg3) {
				@Pc(28) Class26_Sub1_Sub4_Sub2 local28 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2);
				if (local28.method11149()) {
					local28.method11156(arg0);
				}
				local38 = local28;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		}
		@Pc(81) int local81;
		@Pc(90) Interface43 local90;
		@Pc(137) Class26_Sub1_Sub4_Sub2 local137;
		if (arg1 == Class456.aClass456_8.anInt5061 * 821735799) {
			local81 = 65;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray160[arg2], anIntArray161[arg2] * local81, arg1, arg2, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (Class456.aClass456_9.anInt5061 * 821735799 == arg1) {
			local81 = 33;
			local90 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local90 != null) {
				local81 = this.aClass457_1.method28510(local90.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			if (arg3) {
				local137 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray160[arg2] * local81, anIntArray161[arg2] * local81, arg1, arg2 + 4);
				if (local137.method11149()) {
					local137.method11156(arg0);
				}
				local38 = local137;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local81 * anIntArray162[arg2], local81 * anIntArray159[arg2], arg1, arg2 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_10.anInt5061 * 821735799) {
			local81 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(350) Class26_Sub1_Sub4_Sub2 local350 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4);
				if (local350.method11149()) {
					local350.method11156(arg0);
				}
				local38 = local350;
			} else {
				local38 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local81 + 4, arg5, arg6);
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, null);
			return true;
		} else if (arg1 == Class456.aClass456_11.anInt5061 * 821735799) {
			@Pc(409) int local409 = arg2 + 2 & 0x3;
			@Pc(411) int local411 = 33;
			@Pc(420) Interface43 local420 = (Interface43) this.aClass438_6.method28066(arg7, arg12, arg13);
			if (local420 != null) {
				local411 = this.aClass457_1.method28510(local420.method11163()).anInt5110 * -2004613045 / 2 + 1;
			}
			@Pc(513) Class26_Sub1_Sub4 local513;
			if (arg3) {
				@Pc(470) Class26_Sub1_Sub4_Sub2 local470 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, local411 * anIntArray162[arg2], local411 * anIntArray159[arg2], arg1, arg2 + 4);
				@Pc(493) Class26_Sub1_Sub4_Sub2 local493 = new Class26_Sub1_Sub4_Sub2(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4);
				if (local470.method11149()) {
					local470.method11156(arg0);
				}
				if (local493.method11149()) {
					local493.method11156(arg0);
				}
				local38 = local470;
				local513 = local493;
			} else {
				@Pc(547) Class26_Sub1_Sub4_Sub1 local547 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, anIntArray162[arg2] * local411, anIntArray159[arg2] * local411, arg1, arg2 + 4, arg5, arg6);
				@Pc(572) Class26_Sub1_Sub4_Sub1 local572 = new Class26_Sub1_Sub4_Sub1(this.aClass438_6, arg0, this.aClass457_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean220, 0, 0, arg1, local409 + 4, arg5, arg6);
				local38 = local547;
				local513 = local572;
			}
			this.aClass438_6.method28123(arg7, arg12, arg13, local38, local513);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cl", descriptor = "(Lclient!de;IIIII)V", line = 794)
	void method9456(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface43 local7 = this.method9457(arg1, arg2, arg3, arg4);
		if (local7 == null) {
			return;
		}
		@Pc(17) Class467 local17 = this.aClass457_1.method28510(local7.method11163());
		@Pc(21) int local21 = local7.method11146();
		@Pc(25) int local25 = local7.method11147();
		if (local17.method28685()) {
			Class491.method29256(arg1, arg3, arg4, local17);
		}
		if (local7.method11149()) {
			local7.method11159(arg0);
		}
		if (arg2 == 0) {
			this.aClass438_6.method28057(arg1, arg3, arg4);
			this.aClass438_6.method28058(arg1, arg3, arg4);
			if (local17.anInt5084 * 539036537 == 1) {
				if (local25 == 0) {
					this.aClass438_6.aClass444_1.method28308(1, arg1, arg3, arg4);
				} else if (local25 == 1) {
					this.aClass438_6.aClass444_1.method28308(2, arg1, arg3, arg4 + 1);
				} else if (local25 == 2) {
					this.aClass438_6.aClass444_1.method28308(1, arg1, arg3 + 1, arg4);
				} else if (local25 == 3) {
					this.aClass438_6.aClass444_1.method28308(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass438_6.method28059(arg1, arg3, arg4);
			this.aClass438_6.method28060(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.aClass438_6.method28079(arg1, arg3, arg4, client.anInterface48_1);
			if (local21 == Class456.aClass456_6.anInt5061 * 821735799) {
				if ((local25 & 0x1) == 0) {
					this.aClass438_6.aClass444_1.method28308(8, arg1, arg3, arg4);
				} else {
					this.aClass438_6.aClass444_1.method28308(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass438_6.method28160(arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dp", descriptor = "(Lclient!de;IIII)V", line = 794)
	void method9478(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface43 local7 = this.method9457(arg1, arg2, arg3, arg4);
		if (local7 == null) {
			return;
		}
		@Pc(17) Class467 local17 = this.aClass457_1.method28510(local7.method11163());
		@Pc(21) int local21 = local7.method11146();
		@Pc(25) int local25 = local7.method11147();
		if (local17.method28685()) {
			Class491.method29256(arg1, arg3, arg4, local17);
		}
		if (local7.method11149()) {
			local7.method11159(arg0);
		}
		if (arg2 == 0) {
			this.aClass438_6.method28057(arg1, arg3, arg4);
			this.aClass438_6.method28058(arg1, arg3, arg4);
			if (local17.anInt5084 * 539036537 == 1) {
				if (local25 == 0) {
					this.aClass438_6.aClass444_1.method28308(1, arg1, arg3, arg4);
				} else if (local25 == 1) {
					this.aClass438_6.aClass444_1.method28308(2, arg1, arg3, arg4 + 1);
				} else if (local25 == 2) {
					this.aClass438_6.aClass444_1.method28308(1, arg1, arg3 + 1, arg4);
				} else if (local25 == 3) {
					this.aClass438_6.aClass444_1.method28308(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass438_6.method28059(arg1, arg3, arg4);
			this.aClass438_6.method28060(arg1, arg3, arg4);
		} else if (arg2 == 2) {
			this.aClass438_6.method28079(arg1, arg3, arg4, client.anInterface48_1);
			if (local21 == Class456.aClass456_6.anInt5061 * 821735799) {
				if ((local25 & 0x1) == 0) {
					this.aClass438_6.aClass444_1.method28308(8, arg1, arg3, arg4);
				} else {
					this.aClass438_6.aClass444_1.method28308(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass438_6.method28160(arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "cq", descriptor = "(IIIII)Lclient!pp;", line = 829)
	Interface43 method9457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface43 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface43) this.aClass438_6.method28066(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local1 = (Interface43) this.aClass438_6.method28200(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local1 = (Interface43) this.aClass438_6.method28150(arg0, arg2, arg3, client.anInterface48_1);
		}
		if (arg1 == 3) {
			local1 = (Interface43) this.aClass438_6.method28053(arg0, arg2, arg3);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aeu", name = "cg", descriptor = "(Lclient!de;ZI)V", line = 838)
	public final void method9458(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass438_6.method28073();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1074 * 1789717465 > 1) {
				for (local12 = 0; local12 < this.anInt1055 * -576668841; local12++) {
					for (local20 = 0; local20 < this.anInt1056 * 1605649813; local20++) {
						if ((this.aClass346_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass438_6.method28038(local12, local20);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1074 * 1789717465; local12++) {
				for (local20 = 0; local20 <= this.anInt1056 * 1605649813; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1055 * -576668841; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(86) int local86 = local67;
							@Pc(88) int local88 = local67;
							@Pc(90) int local90 = local20;
							@Pc(92) int local92 = local20;
							while (local90 > 0 && (this.aByteArrayArrayArray6[local12][local67][local90 - 1] & 0x4) != 0 && local92 - local90 < 10) {
								local90--;
							}
							while (local92 < this.anInt1056 * 1605649813 && (this.aByteArrayArrayArray6[local12][local67][local92 + 1] & 0x4) != 0 && local92 - local90 < 10) {
								local92++;
							}
							@Pc(150) int local150;
							label108: while (local86 > 0 && local88 - local86 < 10) {
								for (local150 = local90; local150 <= local92; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local86 - 1][local150] & 0x4) == 0) {
										break label108;
									}
								}
								local86--;
							}
							label95: while (local88 < this.anInt1055 * -576668841 && local88 - local86 < 10) {
								for (local150 = local90; local150 <= local92; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local88 + 1][local150] & 0x4) == 0) {
										break label95;
									}
								}
								local88++;
							}
							if ((local92 - local90 + 1) * ((local88 - local86) + 1) >= 4) {
								local150 = this.anIntArrayArrayArray14[local12][local86][local90];
								this.aClass438_6.aClass444_1.method28280(4, local12, local86 << 9, (local88 << 9) + 512, local90 << 9, (local92 << 9) + 512, local150, local150);
								for (@Pc(253) int local253 = local86; local253 <= local88; local253++) {
									for (@Pc(258) int local258 = local90; local258 <= local92; local258++) {
										this.aByteArrayArrayArray6[local12][local253][local258] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass438_6.aClass444_1.method28311();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aeu", name = "dk", descriptor = "(Lclient!de;Z)V", line = 838)
	public final void method9472(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass438_6.method28073();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1074 * 1789717465 > 1) {
				for (local12 = 0; local12 < this.anInt1055 * -576668841; local12++) {
					for (local20 = 0; local20 < this.anInt1056 * 1605649813; local20++) {
						if ((this.aClass346_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass438_6.method28038(local12, local20);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1074 * 1789717465; local12++) {
				for (local20 = 0; local20 <= this.anInt1056 * 1605649813; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1055 * -576668841; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(86) int local86 = local67;
							@Pc(88) int local88 = local67;
							@Pc(90) int local90 = local20;
							@Pc(92) int local92 = local20;
							while (local90 > 0 && (this.aByteArrayArrayArray6[local12][local67][local90 - 1] & 0x4) != 0 && local92 - local90 < 10) {
								local90--;
							}
							while (local92 < this.anInt1056 * 1605649813 && (this.aByteArrayArrayArray6[local12][local67][local92 + 1] & 0x4) != 0 && local92 - local90 < 10) {
								local92++;
							}
							@Pc(150) int local150;
							label108: while (local86 > 0 && local88 - local86 < 10) {
								for (local150 = local90; local150 <= local92; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local86 - 1][local150] & 0x4) == 0) {
										break label108;
									}
								}
								local86--;
							}
							label95: while (local88 < this.anInt1055 * -576668841 && local88 - local86 < 10) {
								for (local150 = local90; local150 <= local92; local150++) {
									if ((this.aByteArrayArrayArray6[local12][local88 + 1][local150] & 0x4) == 0) {
										break label95;
									}
								}
								local88++;
							}
							if ((local92 - local90 + 1) * ((local88 - local86) + 1) >= 4) {
								local150 = this.anIntArrayArrayArray14[local12][local86][local90];
								this.aClass438_6.aClass444_1.method28280(4, local12, local86 << 9, (local88 << 9) + 512, local90 << 9, (local92 << 9) + 512, local150, local150);
								for (@Pc(253) int local253 = local86; local253 <= local88; local253++) {
									for (@Pc(258) int local258 = local90; local258 <= local92; local258++) {
										this.aByteArrayArrayArray6[local12][local253][local258] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass438_6.aClass444_1.method28311();
		}
		this.aByteArrayArrayArray6 = null;
	}
}
