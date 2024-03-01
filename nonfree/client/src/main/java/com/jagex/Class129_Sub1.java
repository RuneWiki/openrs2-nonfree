package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahj")
public class Class129_Sub1 extends Class129 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ahj", name = "this$0", descriptor = "Lclient!jm;")
	final Class364 this$0;

	@OriginalMember(owner = "client!ahj", name = "m", descriptor = "Z")
	boolean aBoolean185;

	@OriginalMember(owner = "client!ahj", name = "k", descriptor = "Ljava/awt/Font;")
	Font aFont2;

	@OriginalMember(owner = "client!ahj", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ahj", name = "w", descriptor = "Ljava/awt/Color;")
	Color aColor1;

	@OriginalMember(owner = "client!ahj", name = "c", descriptor = "(B)Lclient!zr;", line = 137)
	public static Class715 method9406() {
		return Class325.aClass715_1 == null ? Class715.aClass715_5 : Class325.aClass715_1;
	}

	@OriginalMember(owner = "client!ahj", name = "<init>", descriptor = "(Lclient!jm;ZLjava/lang/String;IIII)V", line = 238)
	Class129_Sub1(@OriginalArg(0) Class364 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg5, arg6);
		this.this$0 = arg0;
		this.aBoolean185 = arg1;
		this.aFont2 = new Font(arg2, 0, arg3);
		this.aFontMetrics1 = Class125_Sub3.aCanvas1.getFontMetrics(this.aFont2);
		this.aColor1 = new Color(arg4);
	}

	@OriginalMember(owner = "client!ahj", name = "e", descriptor = "(Ljava/awt/Graphics;B)V", line = 248)
	@Override
	void method21471(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "k", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method21474(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "n", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method21472(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "m", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method21470(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "f", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method21475(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "w", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method21473(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean185) {
			local6 = this.this$0.aString189;
		} else {
			local6 = this.this$0.aString190 + " " + this.this$0.aString189;
		}
		arg0.setFont(this.aFont2);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27886(this.aFontMetrics1.stringWidth(local6)) + this.anInt2994 * -228338075, this.this$0.method27882(0) + this.anInt2995 * 1110069385);
	}

	@OriginalMember(owner = "client!ahj", name = "y", descriptor = "(II)V", line = 594)
	static void method9407(@OriginalArg(0) int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					Class166_Sub4.method15436();
				} else if (arg0 == 11) {
					Class314.method26939("" + Class553.anInt3407 * 1249273355);
				} else if (arg0 == 24) {
					@Pc(43) Class598 local43 = client.aClass532_1.method30459().aClass598_2;
					local43.aBoolean824 = !local43.aBoolean824;
				} else if (arg0 == 25) {
					client.aBoolean599 = true;
				} else if (arg0 == 21) {
					client.aBoolean599 = false;
				} else if (arg0 == 10) {
					client.aClass21_6.method378();
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 5) {
						Class684.method33423();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95);
					} else if (arg0 == 20) {
						Class684.method33423();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95);
						Class510.method30248();
						Class684.method33423();
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class314.method26939("" + local95);
					} else if (arg0 == 9) {
						Class314.method26939(Class125_Sub1.aClass586_1.method31624() ? "Success" : "Failure");
					} else if (arg0 == 23) {
						Class50.aClass28_5.method593();
					} else if (arg0 == 14) {
						Class520.aClass144_3.method11154();
					} else if (arg0 == 6) {
						Class520.aClass144_3.method11148();
					} else if (arg0 == 26) {
						Class125_Sub3.aCanvas1.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class125_Sub3.aCanvas1.setLocation(Class553.anInt3414 * 495533241, Class553.anInt3415 * -1074927711);
					} else if (arg0 == 4) {
						Class660.method32822();
					} else if (arg0 == 17) {
						client.aClass532_1.aLong286 = Class305.method26796() * -3941212876594184505L;
						client.aClass532_1.aBoolean790 = true;
						Class660.method32822();
					} else {
						@Pc(254) Class472 local254;
						if (arg0 == 19) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
							Class314.method26939(((int) local254.aFloat317 >> 9) + " " + ((int) local254.aFloat319 >> 9));
						} else if (arg0 == 16) {
							local254 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
							Class314.method26939("" + client.aClass532_1.method30459().aClass99Array1[Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100].method2482((int) local254.aFloat317 >> 9, (int) local254.aFloat319 >> 9));
						} else if (arg0 == 27) {
							Class314.method26939(Class312.aClass240_74.method25835() + " " + Class312.aClass240_74.method25834());
							Class314.method26939(Class312.aClass240_77.method25835() + " " + Class312.aClass240_77.method25834());
						} else if (arg0 == 8) {
							Class700.method36716(false);
						} else if (arg0 == 13) {
							client.aBoolean610 = !client.aBoolean610;
							Class694.aClass104_14.method20552(client.aBoolean610);
							Class125_Sub3.method10061();
							return;
						} else if (arg0 == 1) {
							client.anInt3536 = 0;
							client.aClass532_1.method30469();
						} else if (arg0 == 3) {
							client.anInt3536 = 136416013;
							client.aClass532_1.method30469();
						} else if (arg0 == 15) {
							client.anInt3536 = 272832026;
							client.aClass532_1.method30469();
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.aClass717_8));
			}
		}
	}

	@OriginalMember(owner = "client!ahj", name = "hp", descriptor = "(I)V", line = 4831)
	static final void method9403() {
		@Pc(3) byte[][][] local3 = client.aClass532_1.method30458();
		@Pc(12) byte local12 = (byte) (client.anInt3495 * 1815175593 - 4 & 0xFF);
		@Pc(20) int local20 = client.anInt3495 * 1815175593 % client.aClass532_1.method30444();
		@Pc(22) int local22;
		for (local22 = 0; local22 < 4; local22++) {
			for (@Pc(27) int local27 = 0; local27 < client.aClass532_1.method30474(); local27++) {
				local3[local22][local20][local27] = local12;
			}
		}
		if (Class512.anInt5209 * 1177442423 == 3) {
			return;
		}
		for (local22 = 0; local22 < 2; local22++) {
			client.anIntArray327[local22] = -1000000;
			client.anIntArray312[local22] = 1000000;
			client.anIntArray313[local22] = 0;
			client.anIntArray302[local22] = 1000000;
			client.anIntArray314[local22] = 0;
		}
		@Pc(81) Class472 local81 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
		@Pc(85) Class520 local85 = client.aClass532_1.method30509();
		@Pc(89) Class585 local89 = client.aClass532_1.method30459();
		@Pc(135) int local135;
		if (Class429.anInt4781 * -1453926679 != 2 && Class429.anInt4781 * -1453926679 != 3 && Class175.anInt3306 * -364465283 == -1) {
			local135 = Class305.method26801(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, Class512.anInt5209 * 1177442423);
			if (local135 - Class130_Sub2.anInt1117 * 1055108289 < 3200 && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][Class163.anInt2002 * -1331168249 >> 9][Class270.anInt3884 * 466086187 >> 9] & 0x4) != 0) {
				Class539.method30883(local89.aClass572ArrayArrayArray3, 1, Class163.anInt2002 * -1331168249 >> 9, Class270.anInt3884 * 466086187 >> 9, false);
			}
			return;
		}
		@Pc(108) Class611 local108 = client.aClass532_1.method30443();
		@Pc(146) int local146;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(119) Class472 local119 = Class65.aClass123_Sub1_2.method9040().method23122();
			if (Float.isNaN(local119.aFloat317)) {
				return;
			}
			local135 = (int) local119.aFloat317 - (local108.anInt5623 * 270611681 << 9);
			local146 = (int) local119.aFloat319 - (local108.anInt5624 * -1994307635 << 9);
			if (local135 < 0 || local146 < 0 || local135 >> 9 >= local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length || local146 >> 9 >= local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local135 >> 9].length) {
				return;
			}
		} else if (Class429.anInt4781 * -1453926679 == 2) {
			local135 = (int) local81.aFloat317;
			local146 = (int) local81.aFloat319;
		} else {
			local135 = Class175.anInt3306 * -364465283;
			local146 = Class444.anInt4895 * 514503773;
		}
		if ((local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local135 >> 9][local146 >> 9] & 0x4) != 0) {
			Class539.method30883(local89.aClass572ArrayArrayArray3, 0, local135 >> 9, local146 >> 9, false);
			return;
		}
		@Pc(265) int local265;
		@Pc(254) int local254;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(243) Class472 local243 = Class65.aClass123_Sub1_2.method8952().method21402();
			local254 = ((int) local243.aFloat317 >> 9) - local108.anInt5623 * 270611681;
			local265 = ((int) local243.aFloat319 >> 9) - local108.anInt5624 * -1994307635;
			if (local254 < 0 || local265 < 0 || local254 >= local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length || local265 >= local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254].length) {
				return;
			}
		} else {
			local254 = Class163.anInt2002 * -1331168249 >> 9;
			local265 = Class270.anInt3884 * 466086187 >> 9;
		}
		@Pc(307) int local307 = local135 >> 9;
		@Pc(311) int local311 = local146 >> 9;
		@Pc(327) int local327;
		if (local85.method30327(local254, local265)) {
			local327 = Class305.method26801(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, 3);
			if (Class130_Sub2.anInt1117 * 1055108289 >= local327) {
				Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265, false);
			}
			return;
		}
		if (Class620.anInt5644 * 607613741 >= 2560) {
			return;
		}
		if (local307 > local254) {
			local327 = local307 - local254;
		} else {
			local327 = local254 - local307;
		}
		@Pc(366) int local366;
		if (local311 > local265) {
			local366 = local311 - local265;
		} else {
			local366 = local265 - local311;
		}
		if (local327 == 0 && local366 == 0 || local327 <= -client.aClass532_1.method30444() || local327 >= client.aClass532_1.method30444() || local366 <= -client.aClass532_1.method30474() || local366 >= client.aClass532_1.method30474()) {
			if (Class429.anInt4781 * -1453926679 != 3) {
				Class646.method32610(local254 + Class430.aString204 + local265 + " " + local307 + Class430.aString204 + local311 + " " + local108.anInt5623 * 270611681 + Class430.aString204 + local108.anInt5624 * -1994307635, new RuntimeException());
			}
			return;
		}
		@Pc(449) int local449;
		@Pc(451) int local451;
		if (local327 <= local366) {
			local449 = local327 * 65536 / local366;
			local451 = 32768;
			while (local311 != local265) {
				if (local265 < local311) {
					local265++;
				} else if (local265 > local311) {
					local265--;
				}
				if ((local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265] & 0x4) != 0) {
					Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265, false);
					break;
				}
				if (local254 + 1 < local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254 + 1][local265] & 0x4) != 0) {
					Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254 + 1, local265, false);
					break;
				}
				if (local254 > 0 && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254 - 1][local265] & 0x4) != 0) {
					Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254 - 1, local265, false);
					break;
				}
				local451 += local449;
				if (local451 >= 65536) {
					local451 -= 65536;
					if (local254 < local307) {
						local254++;
						if (local254 + 1 < local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423].length && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254 + 1][local265] & 0x4) != 0) {
							Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254 + 1, local265, false);
							break;
						}
					} else if (local254 > local307) {
						local254--;
						if (local254 > 0 && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254 - 1][local265] & 0x4) != 0) {
							Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254 - 1, local265, false);
							break;
						}
					}
				}
			}
			return;
		}
		local449 = local366 * 65536 / local327;
		local451 = 32768;
		while (local254 != local307) {
			if (local254 < local307) {
				local254++;
			} else if (local254 > local307) {
				local254--;
			}
			if ((local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265] & 0x4) != 0) {
				Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265, false);
				break;
			}
			if (local265 + 1 < local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254].length && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265 + 1] & 0x4) != 0) {
				Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265 + 1, false);
				break;
			}
			if (local265 > 0 && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265 - 1] & 0x4) != 0) {
				Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265 - 1, false);
				break;
			}
			local451 += local449;
			if (local451 >= 65536) {
				local451 -= 65536;
				if (local265 < local311) {
					local265++;
					if (local265 + 1 < local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254].length && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265 + 1] & 0x4) != 0) {
						Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265 + 1, false);
						break;
					}
				} else if (local265 > local311) {
					local265--;
					if (local265 > 0 && (local85.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local254][local265 - 1] & 0x4) != 0) {
						Class539.method30883(local89.aClass572ArrayArrayArray3, 1, local254, local265 - 1, false);
						break;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ahj", name = "abb", descriptor = "(Lclient!yf;B)V", line = 9843)
	static final void method9404(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!ahj", name = "aqb", descriptor = "(Lclient!yf;I)V", line = 12853)
	static final void method9405(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5888 -= 957530791;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}
}
