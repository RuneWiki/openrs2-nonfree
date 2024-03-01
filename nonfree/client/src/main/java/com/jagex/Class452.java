package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public class Class452 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public static final int anInt5024 = 1;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public static final int anInt5032 = 0;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static final int anInt5033 = 2;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Ljava/lang/String;")
	public String aString224;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "I")
	public int anInt5034;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Ljava/lang/String;")
	public String aString225;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	int anInt5039;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	public int anInt5040;

	@OriginalMember(owner = "client!se", name = "ax", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	int anInt5042;

	@OriginalMember(owner = "client!se", name = "at", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!se", name = "az", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	int anInt5046;

	@OriginalMember(owner = "client!se", name = "an", descriptor = "I")
	public int anInt5047;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!sg;")
	Class454 aClass454_4;

	@OriginalMember(owner = "client!se", name = "aq", descriptor = "I")
	public int anInt5050;

	@OriginalMember(owner = "client!se", name = "av", descriptor = "I")
	public int anInt5051;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	int anInt5052;

	@OriginalMember(owner = "client!se", name = "ap", descriptor = "Lclient!xn;")
	Class581 aClass581_33;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public int anInt5026 = 734726263;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public int anInt5027 = -513916019;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public int anInt5030 = 1128645121;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public int anInt5041 = 0;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Z")
	public boolean aBoolean775 = true;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
	public boolean aBoolean774 = false;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray16 = new String[5];

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	int anInt5038 = -792522095;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	int anInt5053 = -1136758615;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	int anInt5031 = 1295253257;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	int anInt5043 = 1506010001;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	int anInt5036 = 263437749;

	@OriginalMember(owner = "client!se", name = "af", descriptor = "I")
	public int anInt5044 = -1563080569;

	@OriginalMember(owner = "client!se", name = "ak", descriptor = "I")
	public int anInt5045 = -1923690975;

	@OriginalMember(owner = "client!se", name = "aa", descriptor = "I")
	public int anInt5029 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!se", name = "ah", descriptor = "I")
	public int anInt5037 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!se", name = "aj", descriptor = "I")
	public int anInt5048 = 541189397;

	@OriginalMember(owner = "client!se", name = "as", descriptor = "I")
	public int anInt5049 = 1721850817;

	@OriginalMember(owner = "client!se", name = "ai", descriptor = "I")
	public int anInt5028 = 895836637;

	@OriginalMember(owner = "client!se", name = "al", descriptor = "Z")
	public boolean aBoolean776 = true;

	@OriginalMember(owner = "client!se", name = "ao", descriptor = "I")
	public int anInt5054 = 927369747;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 60)
	Class452() {
	}

	@OriginalMember(owner = "client!se", name = "p", descriptor = "(Lclient!ahb;B)V", line = 64)
	void method28396(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28416(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!se", name = "y", descriptor = "(Lclient!ahb;)V", line = 64)
	void method28414(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28416(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!ahb;I)V", line = 71)
	void method28393(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(Lclient!ahb;I)V", line = 71)
	void method28397(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "z", descriptor = "(Lclient!ahb;I)V", line = 71)
	void method28404(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "(Lclient!ahb;I)V", line = 71)
	void method28405(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "n", descriptor = "(Lclient!ahb;I)V", line = 71)
	void method28406(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ahb;II)V", line = 71)
	void method28416(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5026 = arg0.method20375() * -734726263;
		} else if (arg1 == 2) {
			this.anInt5027 = arg0.method20375() * 513916019;
		} else if (arg1 == 3) {
			this.aString224 = arg0.method20283();
		} else if (arg1 == 4) {
			this.anInt5040 = arg0.method20273() * 114481845;
		} else if (arg1 == 5) {
			this.anInt5030 = arg0.method20273() * -1128645121;
		} else if (arg1 == 6) {
			this.anInt5041 = arg0.method20269() * -1490734683;
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method20269();
				if ((local70 & 0x1) == 0) {
					this.aBoolean775 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean774 = true;
				}
			} else if (arg1 == 8) {
				arg0.method20269();
			} else if (arg1 == 9) {
				this.anInt5053 = arg0.method20271() * 1136758615;
				if (this.anInt5053 * 1451936871 == 65535) {
					this.anInt5053 = -1136758615;
				}
				this.anInt5031 = arg0.method20271() * -1295253257;
				if (this.anInt5031 * -1738620729 == 65535) {
					this.anInt5031 = 1295253257;
				}
				this.anInt5039 = arg0.method20275() * 229610621;
				this.anInt5046 = arg0.method20275() * 808455399;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray16[arg1 - 10] = arg0.method20283();
			} else {
				@Pc(176) int local176;
				if (arg1 == 15) {
					local70 = arg0.method20269();
					this.anIntArray458 = new int[local70 * 2];
					for (local176 = 0; local176 < local70 * 2; local176++) {
						this.anIntArray458[local176] = arg0.method20272();
					}
					this.anInt5047 = arg0.method20275() * 1132286329;
					local176 = arg0.method20269();
					this.anIntArray457 = new int[local176];
					@Pc(207) int local207;
					for (local207 = 0; local207 < this.anIntArray457.length; local207++) {
						this.anIntArray457[local207] = arg0.method20275();
					}
					this.aByteArray91 = new byte[local70];
					for (local207 = 0; local207 < local70; local207++) {
						this.aByteArray91[local207] = arg0.method20390();
					}
				} else if (arg1 == 16) {
					this.aBoolean776 = false;
				} else if (arg1 == 17) {
					this.aString225 = arg0.method20283();
				} else if (arg1 == 18) {
					this.anInt5038 = arg0.method20375() * 792522095;
				} else if (arg1 == 19) {
					this.anInt5054 = arg0.method20271() * -927369747;
				} else if (arg1 == 20) {
					this.anInt5043 = arg0.method20271() * -1506010001;
					if (this.anInt5043 * 119587471 == 65535) {
						this.anInt5043 = 1506010001;
					}
					this.anInt5036 = arg0.method20271() * -263437749;
					if (this.anInt5036 * 69531491 == 65535) {
						this.anInt5036 = 263437749;
					}
					this.anInt5052 = arg0.method20275() * 1330305603;
					this.anInt5042 = arg0.method20275() * -1330025405;
				} else if (arg1 == 21) {
					this.anInt5035 = arg0.method20275() * 1417084061;
				} else if (arg1 == 22) {
					this.anInt5034 = arg0.method20275() * -1074862705;
				} else if (arg1 == 23) {
					this.anInt5048 = arg0.method20269() * -541189397;
					this.anInt5049 = arg0.method20269() * -1721850817;
					this.anInt5028 = arg0.method20269() * -895836637;
				} else if (arg1 == 24) {
					this.anInt5050 = arg0.method20272() * 259065067;
					this.anInt5051 = arg0.method20272() * -1669931509;
				} else if (arg1 == 249) {
					local70 = arg0.method20269();
					if (this.aClass581_33 == null) {
						local176 = Class302.method25670(local70);
						this.aClass581_33 = new Class581(local176);
					}
					for (local176 = 0; local176 < local70; local176++) {
						@Pc(428) boolean local428 = arg0.method20269() == 1;
						@Pc(432) int local432 = arg0.method20273();
						@Pc(441) Class3 local441;
						if (local428) {
							local441 = new Class3_Sub29(arg0.method20283());
						} else {
							local441 = new Class3_Sub21(arg0.method20275());
						}
						this.aClass581_33.method33241(local441, (long) local432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "x", descriptor = "(IZS)I", line = 76)
	public static int method28425(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class3_Sub8 local8 = Class14.method3338(arg0, arg1);
		if (local8 == null) {
			return Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray178.length; local23++) {
			if (local8.anIntArray178[local23] == -1) {
				local21++;
			}
		}
		return local21 + (Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239 - local8.anIntArray178.length);
	}

	@OriginalMember(owner = "client!se", name = "r", descriptor = "(Lclient!vs;S)V", line = 80)
	static void method28420(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray484 == null ? 0 : local15.anIntArray484.length;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(B)V", line = 147)
	void method28403() {
		if (this.anIntArray458 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray458.length; local5 += 2) {
			if (this.anIntArray458[local5] < this.anInt5044 * 931070665) {
				this.anInt5044 = this.anIntArray458[local5] * -584403079;
			} else if (this.anIntArray458[local5] > this.anInt5029 * -1797323007) {
				this.anInt5029 = this.anIntArray458[local5] * 1179777281;
			}
			if (this.anIntArray458[local5 + 1] < this.anInt5045 * -1023948257) {
				this.anInt5045 = this.anIntArray458[local5 + 1] * -223792673;
			} else if (this.anIntArray458[local5 + 1] > this.anInt5037 * 294573617) {
				this.anInt5037 = this.anIntArray458[local5 + 1] * -558710063;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "l", descriptor = "(Lclient!cz;Lclient!ct;I)Z", line = 159)
	public boolean method28402(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(19) int local19;
		if (this.anInt5031 * -1738620729 == -1) {
			if (this.anInt5053 * 1451936871 == -1) {
				return true;
			}
			@Pc(34) Class290 local34 = arg0.method24296(this.anInt5053 * 1451936871);
			local19 = arg1.method32384(local34);
		} else {
			@Pc(14) Class11 local14 = arg0.method24295(Class43.aClass43_68, this.anInt5031 * -1738620729);
			local19 = arg1.method32385(local14);
		}
		if (local19 < this.anInt5039 * -770865963 || local19 > this.anInt5046 * 1228031703) {
			return false;
		}
		@Pc(78) int local78;
		if (this.anInt5036 * 69531491 == -1) {
			if (this.anInt5043 * 119587471 == -1) {
				return true;
			}
			@Pc(93) Class290 local93 = arg0.method24296(this.anInt5043 * 119587471);
			local78 = arg1.method32384(local93);
		} else {
			@Pc(73) Class11 local73 = arg0.method24295(Class43.aClass43_68, this.anInt5036 * 69531491);
			local78 = arg1.method32385(local73);
		}
		return local78 >= this.anInt5052 * -143605141 && local78 <= this.anInt5042 * 459620459;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(Lclient!cz;Lclient!ct;)Z", line = 159)
	public boolean method28407(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(19) int local19;
		if (this.anInt5031 * -1738620729 == -1) {
			if (this.anInt5053 * 1451936871 == -1) {
				return true;
			}
			@Pc(34) Class290 local34 = arg0.method24296(this.anInt5053 * 1451936871);
			local19 = arg1.method32384(local34);
		} else {
			@Pc(14) Class11 local14 = arg0.method24295(Class43.aClass43_68, this.anInt5031 * -1738620729);
			local19 = arg1.method32385(local14);
		}
		if (local19 < this.anInt5039 * -770865963 || local19 > this.anInt5046 * 1228031703) {
			return false;
		}
		@Pc(78) int local78;
		if (this.anInt5036 * 69531491 == -1) {
			if (this.anInt5043 * 119587471 == -1) {
				return true;
			}
			@Pc(93) Class290 local93 = arg0.method24296(this.anInt5043 * 119587471);
			local78 = arg1.method32384(local93);
		} else {
			@Pc(73) Class11 local73 = arg0.method24295(Class43.aClass43_68, this.anInt5036 * 69531491);
			local78 = arg1.method32385(local73);
		}
		return local78 >= this.anInt5052 * -143605141 && local78 <= this.anInt5042 * 459620459;
	}

	@OriginalMember(owner = "client!se", name = "r", descriptor = "(Lclient!cz;Lclient!ct;)Z", line = 159)
	public boolean method28408(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(19) int local19;
		if (this.anInt5031 * -1738620729 == -1) {
			if (this.anInt5053 * 1451936871 == -1) {
				return true;
			}
			@Pc(34) Class290 local34 = arg0.method24296(this.anInt5053 * 1451936871);
			local19 = arg1.method32384(local34);
		} else {
			@Pc(14) Class11 local14 = arg0.method24295(Class43.aClass43_68, this.anInt5031 * -1738620729);
			local19 = arg1.method32385(local14);
		}
		if (local19 < this.anInt5039 * -770865963 || local19 > this.anInt5046 * 1228031703) {
			return false;
		}
		@Pc(78) int local78;
		if (this.anInt5036 * 69531491 == -1) {
			if (this.anInt5043 * 119587471 == -1) {
				return true;
			}
			@Pc(93) Class290 local93 = arg0.method24296(this.anInt5043 * 119587471);
			local78 = arg1.method32384(local93);
		} else {
			@Pc(73) Class11 local73 = arg0.method24295(Class43.aClass43_68, this.anInt5036 * 69531491);
			local78 = arg1.method32385(local73);
		}
		return local78 >= this.anInt5052 * -143605141 && local78 <= this.anInt5042 * 459620459;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(Lclient!cz;Lclient!ct;)Z", line = 159)
	public boolean method28409(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(19) int local19;
		if (this.anInt5031 * -1738620729 == -1) {
			if (this.anInt5053 * 1451936871 == -1) {
				return true;
			}
			@Pc(34) Class290 local34 = arg0.method24296(this.anInt5053 * 1451936871);
			local19 = arg1.method32384(local34);
		} else {
			@Pc(14) Class11 local14 = arg0.method24295(Class43.aClass43_68, this.anInt5031 * -1738620729);
			local19 = arg1.method32385(local14);
		}
		if (local19 < this.anInt5039 * -770865963 || local19 > this.anInt5046 * 1228031703) {
			return false;
		}
		@Pc(78) int local78;
		if (this.anInt5036 * 69531491 == -1) {
			if (this.anInt5043 * 119587471 == -1) {
				return true;
			}
			@Pc(93) Class290 local93 = arg0.method24296(this.anInt5043 * 119587471);
			local78 = arg1.method32384(local93);
		} else {
			@Pc(73) Class11 local73 = arg0.method24295(Class43.aClass43_68, this.anInt5036 * 69531491);
			local78 = arg1.method32385(local73);
		}
		return local78 >= this.anInt5052 * -143605141 && local78 <= this.anInt5042 * 459620459;
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(Lclient!de;ZI)Lclient!co;", line = 184)
	public Class6 method28398(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5027 * 234440891 : this.anInt5026 * -2127909191;
		@Pc(20) int local20 = local11 | arg0.anInt2463 * -427632027 << 29;
		@Pc(28) Class6 local28 = (Class6) this.aClass454_4.aClass161_44.method23219((long) local20);
		if (local28 != null) {
			return local28;
		} else if (this.aClass454_4.aClass359_78.method26674(local11)) {
			@Pc(49) Class15 local49 = Class137.method22938(this.aClass454_4.aClass359_78, local11, 0);
			if (local49 != null) {
				local28 = arg0.method17089(local49, true);
				this.aClass454_4.aClass161_44.method23222(local28, (long) local20);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "q", descriptor = "(Lclient!de;Z)Lclient!co;", line = 184)
	public Class6 method28410(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5027 * 234440891 : this.anInt5026 * -2127909191;
		@Pc(20) int local20 = local11 | arg0.anInt2463 * -427632027 << 29;
		@Pc(28) Class6 local28 = (Class6) this.aClass454_4.aClass161_44.method23219((long) local20);
		if (local28 != null) {
			return local28;
		} else if (this.aClass454_4.aClass359_78.method26674(local11)) {
			@Pc(49) Class15 local49 = Class137.method22938(this.aClass454_4.aClass359_78, local11, 0);
			if (local49 != null) {
				local28 = arg0.method17089(local49, true);
				this.aClass454_4.aClass161_44.method23222(local28, (long) local20);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "m", descriptor = "(Lclient!de;Z)Lclient!co;", line = 184)
	public Class6 method28411(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5027 * 234440891 : this.anInt5026 * -2127909191;
		@Pc(20) int local20 = local11 | arg0.anInt2463 * -427632027 << 29;
		@Pc(28) Class6 local28 = (Class6) this.aClass454_4.aClass161_44.method23219((long) local20);
		if (local28 != null) {
			return local28;
		} else if (this.aClass454_4.aClass359_78.method26674(local11)) {
			@Pc(49) Class15 local49 = Class137.method22938(this.aClass454_4.aClass359_78, local11, 0);
			if (local49 != null) {
				local28 = arg0.method17089(local49, true);
				this.aClass454_4.aClass161_44.method23222(local28, (long) local20);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "t", descriptor = "(Lclient!de;Z)Lclient!co;", line = 184)
	public Class6 method28413(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5027 * 234440891 : this.anInt5026 * -2127909191;
		@Pc(20) int local20 = local11 | arg0.anInt2463 * -427632027 << 29;
		@Pc(28) Class6 local28 = (Class6) this.aClass454_4.aClass161_44.method23219((long) local20);
		if (local28 != null) {
			return local28;
		} else if (this.aClass454_4.aClass359_78.method26674(local11)) {
			@Pc(49) Class15 local49 = Class137.method22938(this.aClass454_4.aClass359_78, local11, 0);
			if (local49 != null) {
				local28 = arg0.method17089(local49, true);
				this.aClass454_4.aClass161_44.method23222(local28, (long) local20);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "v", descriptor = "(Lclient!de;Z)Lclient!co;", line = 184)
	public Class6 method28415(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5027 * 234440891 : this.anInt5026 * -2127909191;
		@Pc(20) int local20 = local11 | arg0.anInt2463 * -427632027 << 29;
		@Pc(28) Class6 local28 = (Class6) this.aClass454_4.aClass161_44.method23219((long) local20);
		if (local28 != null) {
			return local28;
		} else if (this.aClass454_4.aClass359_78.method26674(local11)) {
			@Pc(49) Class15 local49 = Class137.method22938(this.aClass454_4.aClass359_78, local11, 0);
			if (local49 != null) {
				local28 = arg0.method17089(local49, true);
				this.aClass454_4.aClass161_44.method23222(local28, (long) local20);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "x", descriptor = "(Lclient!de;I)Lclient!co;", line = 198)
	public Class6 method28399(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class6 local19 = (Class6) this.aClass454_4.aClass161_44.method23219((long) (this.anInt5038 * 2122125711 | 0x20000 | arg0.anInt2463 * -427632027 << 29));
		if (local19 != null) {
			return local19;
		}
		this.aClass454_4.aClass359_78.method26674(this.anInt5038 * 2122125711);
		@Pc(43) Class15 local43 = Class137.method22938(this.aClass454_4.aClass359_78, this.anInt5038 * 2122125711, 0);
		if (local43 != null) {
			local19 = arg0.method17089(local43, true);
			this.aClass454_4.aClass161_44.method23222(local19, (long) (this.anInt5038 * 2122125711 | 0x20000 | arg0.anInt2463 * -427632027 << 29));
		}
		return local19;
	}

	@OriginalMember(owner = "client!se", name = "w", descriptor = "(Lclient!de;)Lclient!co;", line = 198)
	public Class6 method28412(@OriginalArg(0) Class21 arg0) {
		@Pc(19) Class6 local19 = (Class6) this.aClass454_4.aClass161_44.method23219((long) (this.anInt5038 * 2122125711 | 0x20000 | arg0.anInt2463 * -427632027 << 29));
		if (local19 != null) {
			return local19;
		}
		this.aClass454_4.aClass359_78.method26674(this.anInt5038 * 2122125711);
		@Pc(43) Class15 local43 = Class137.method22938(this.aClass454_4.aClass359_78, this.anInt5038 * 2122125711, 0);
		if (local43 != null) {
			local19 = arg0.method17089(local43, true);
			this.aClass454_4.aClass161_44.method23222(local19, (long) (this.anInt5038 * 2122125711 | 0x20000 | arg0.anInt2463 * -427632027 << 29));
		}
		return local19;
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(II)I", line = 210)
	public int method28394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!se", name = "o", descriptor = "(II)I", line = 210)
	public int method28395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!se", name = "s", descriptor = "(IIB)I", line = 210)
	public int method28400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(II)I", line = 210)
	public int method28417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!se", name = "u", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 217)
	public String method28401(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!se", name = "k", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 217)
	public String method28418(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!se", name = "at", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 217)
	public String method28419(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_33 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_33.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!se", name = "eq", descriptor = "(IB)Z", line = 1678)
	static boolean method28424(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 18 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!se", name = "ie", descriptor = "(Lclient!vs;B)V", line = 5676)
	static final void method28421(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class245.method24870(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!se", name = "ajj", descriptor = "(Lclient!vs;S)V", line = 10815)
	static final void method28422(@OriginalArg(0) Class536 arg0) {
		Class131.method22900(arg0, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3);
	}

	@OriginalMember(owner = "client!se", name = "amm", descriptor = "(Lclient!vs;B)V", line = 11240)
	static final void method28423(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class163.method23296(local12);
	}
}
