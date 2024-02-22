package a.a;

import a.Class11;
import a.Class12;
import a.Class13;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/a/b")
public class Applet_Sub1_Sub1 extends Applet_Sub1 {

	@OriginalMember(owner = "mudclient!a/a/b", name = "T", descriptor = "I")
	protected static int anInt361;

	@OriginalMember(owner = "mudclient!a/a/b", name = "R", descriptor = "[Ljava/lang/String;")
	protected static String[] aStringArray28 = new String[50];

	@OriginalMember(owner = "mudclient!a/a/b", name = "S", descriptor = "I")
	protected static int anInt360 = 1;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bp", descriptor = "[I")
	protected static final int[] anIntArray167;

	@OriginalMember(owner = "mudclient!a/a/b", name = "Y", descriptor = "Lmudclient!a/a/k;")
	protected Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "mudclient!a/a/b", name = "ba", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bb", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bc", descriptor = "I")
	protected int anInt364;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bf", descriptor = "I")
	protected int anInt365;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bh", descriptor = "I")
	protected int anInt366;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bi", descriptor = "I")
	protected int anInt367;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bj", descriptor = "I")
	protected int anInt368;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bk", descriptor = "I")
	protected int anInt369;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bl", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger3;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bm", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger4;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bn", descriptor = "I")
	protected int anInt370;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bo", descriptor = "I")
	protected int anInt371;

	@OriginalMember(owner = "mudclient!a/a/b", name = "U", descriptor = "Ljava/lang/String;")
	protected String aString29 = "127.0.0.1";

	@OriginalMember(owner = "mudclient!a/a/b", name = "V", descriptor = "I")
	protected int anInt362 = 43594;

	@OriginalMember(owner = "mudclient!a/a/b", name = "W", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "mudclient!a/a/b", name = "X", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "mudclient!a/a/b", name = "Z", descriptor = "[B")
	private byte[] aByteArray24 = new byte[5000];

	@OriginalMember(owner = "mudclient!a/a/b", name = "bd", descriptor = "[J")
	protected long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "mudclient!a/a/b", name = "be", descriptor = "[I")
	protected int[] anIntArray166 = new int[100];

	@OriginalMember(owner = "mudclient!a/a/b", name = "bg", descriptor = "[J")
	protected long[] aLongArray8 = new long[50];

	static {
		aStringArray28[0] = "You must enter both a username";
		aStringArray28[1] = "and a password - Please try again";
		aStringArray28[2] = "Connection lost! Please wait...";
		aStringArray28[3] = "Attempting to re-establish";
		aStringArray28[4] = "That username is already in use.";
		aStringArray28[5] = "Wait 60 seconds then retry";
		aStringArray28[6] = "Please wait...";
		aStringArray28[7] = "Connecting to server";
		aStringArray28[8] = "Sorry! The server is currently full.";
		aStringArray28[9] = "Please try again later";
		aStringArray28[10] = "Invalid username or password.";
		aStringArray28[11] = "Try again, or create a new account";
		aStringArray28[12] = "Sorry! Unable to connect to server.";
		aStringArray28[13] = "Check your internet settings";
		aStringArray28[14] = "Username already taken.";
		aStringArray28[15] = "Please choose another username";
		aStringArray28[16] = "The client has been updated.";
		aStringArray28[17] = "Please reload this page";
		aStringArray28[18] = "You may only use 1 character at once.";
		aStringArray28[19] = "Your ip-address is already in use";
		aStringArray28[20] = "Login attempts exceeded!";
		aStringArray28[21] = "Please try again in 5 minutes";
		aStringArray28[22] = "Account has been temporarily disabled";
		aStringArray28[23] = "check your message inbox for details";
		aStringArray28[24] = "Account has been permanently disabled";
		aStringArray28[25] = "check your message inbox for details";
		aStringArray28[26] = "You need a members account";
		aStringArray28[27] = "to login to this server";
		aStringArray28[28] = "Please login to a members server";
		aStringArray28[29] = "to access member-only features";
		anIntArray167 = new int[] { 124, 345, 953, 124, 634, 636, 661, 127, 177, 295, 559, 384, 321, 679, 871, 592, 679, 347, 926, 585, 681, 195, 785, 679, 818, 115, 226, 799, 925, 852, 194, 966, 32, 3, 4, 5, 6, 7, 8, 9, 40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 444, 52, 3, 4, 5, 6, 7, 8, 9, 60, 1, 2, 3, 4, 5, 6, 7, 8, 9, 70, 1, 2, 3, 4, 5, 6, 7, 8, 9, 80, 1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 110, 1, 2, 3, 4, 5, 6, 7, 8, 9, 120, 1, 2, 3, 4, 5, 6, 7, 8, 9, 130, 1, 2, 3, 4, 5, 6, 7, 8, 9, 140, 1, 2, 3, 4, 5, 6, 7, 8, 9, 150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 160, 1, 2, 3, 4, 5, 6, 7, 8, 9, 170, 1, 2, 3, 4, 5, 6, 7, 8, 9, 180, 1, 2, 3, 4, 5, 6, 7, 8, 9, 694, 235, 846, 834, 300, 200, 298, 278, 247, 286, 346, 144, 23, 913, 812, 765, 432, 176, 935, 452, 542, 45, 346, 65, 637, 62, 354, 123, 34, 912, 812, 834, 698, 324, 872, 912, 438, 765, 344, 731, 625, 783, 176, 658, 128, 854, 489, 85, 6, 865, 43, 573, 132, 527, 235, 434, 658, 912, 825, 298, 753, 282, 652, 439, 629, 945 };
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	protected final void method467(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		this.aBigInteger3 = arg0;
		this.aBigInteger4 = arg1;
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "j", descriptor = "()I")
	protected int method468() {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	protected final void method469(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt371 > 0) {
			this.method486(aStringArray28[6], aStringArray28[7]);
			try {
				Thread.sleep(2000L);
			} catch (@Pc(16) Exception local16) {
			}
			this.method486(aStringArray28[8], aStringArray28[9]);
			return;
		}
		try {
			this.aString30 = arg0;
			@Pc(32) String local32 = Class11.method312(arg0, 20);
			this.aString31 = arg1;
			@Pc(39) String local39 = Class11.method312(arg1, 20);
			if (local32.trim().length() == 0) {
				this.method486(aStringArray28[0], aStringArray28[1]);
			} else {
				if (arg2) {
					this.method472(aStringArray28[2], aStringArray28[3]);
				} else {
					this.method486(aStringArray28[6], aStringArray28[7]);
				}
				this.aClass7_Sub1_2 = new Class7_Sub1(this.method465(this.aString29, this.anInt362), this);
				this.aClass7_Sub1_2.anInt236 = anInt361;
				@Pc(92) int local92 = this.aClass7_Sub1_2.method275();
				this.anInt370 = local92;
				System.out.println("Session id: " + local92);
				@Pc(106) int local106 = 0;
				try {
					if (this.method453()) {
						@Pc(113) String local113 = this.getParameter("referid");
						local106 = Integer.parseInt(local113);
						@Pc(120) String local120 = this.getParameter("limit30");
						if (local120.equals("1")) {
							local106 += 50;
						}
					}
				} catch (@Pc(127) Exception local127) {
				}
				if (arg2) {
					this.aClass7_Sub1_2.method285(19, 712);
				} else {
					this.aClass7_Sub1_2.method285(0, 625);
				}
				this.aClass7_Sub1_2.method279(anInt360);
				this.aClass7_Sub1_2.method279(local106);
				this.aClass7_Sub1_2.method281(Class11.method315(local32));
				this.aClass7_Sub1_2.method284(local39, local92, this.aBigInteger3, this.aBigInteger4);
				this.aClass7_Sub1_2.method280(this.method468());
				this.aClass7_Sub1_2.method288();
				this.aClass7_Sub1_2.method269();
				@Pc(179) int local179 = this.aClass7_Sub1_2.method269();
				@Pc(185) int local185 = this.aClass7_Sub1_2.method286(local179, anIntArray167);
				System.out.println("Login response: " + local185);
				if (local185 == 0) {
					this.anInt363 = 0;
					this.method488();
				} else if (local185 == 1) {
					this.anInt363 = 0;
					this.method487();
				} else if (arg2) {
					this.method489();
				} else if (local185 == 3) {
					this.method486(aStringArray28[10], aStringArray28[11]);
				} else if (local185 == 4) {
					this.method486(aStringArray28[4], aStringArray28[5]);
				} else if (local185 == 5) {
					this.method486(aStringArray28[16], aStringArray28[17]);
				} else if (local185 == 6) {
					this.method486(aStringArray28[18], aStringArray28[19]);
				} else if (local185 == 7) {
					this.method486(aStringArray28[20], aStringArray28[21]);
				} else if (local185 == 11) {
					this.method486(aStringArray28[22], aStringArray28[23]);
				} else if (local185 == 12) {
					this.method486(aStringArray28[24], aStringArray28[25]);
				} else if (local185 == 13) {
					this.method486(aStringArray28[14], aStringArray28[15]);
				} else if (local185 == 14) {
					this.method486(aStringArray28[8], aStringArray28[9]);
					this.anInt371 = 1500;
				} else if (local185 == 15) {
					this.method486(aStringArray28[26], aStringArray28[27]);
				} else if (local185 == 16) {
					this.method486(aStringArray28[28], aStringArray28[29]);
				} else {
					this.method486(aStringArray28[12], aStringArray28[13]);
				}
			}
		} catch (@Pc(365) Exception local365) {
			System.out.println(String.valueOf(local365));
			if (this.anInt363 > 0) {
				try {
					Thread.sleep(5000L);
				} catch (@Pc(376) Exception local376) {
				}
				this.anInt363--;
				this.method469(this.aString30, this.aString31, arg2);
			}
			if (arg2) {
				this.aString30 = "";
				this.aString31 = "";
				this.method489();
			} else {
				this.method486(aStringArray28[12], aStringArray28[13]);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "k", descriptor = "()V")
	protected final void method470() {
		if (this.aClass7_Sub1_2 != null) {
			try {
				this.aClass7_Sub1_2.method285(1, 325);
				this.aClass7_Sub1_2.method288();
			} catch (@Pc(12) IOException local12) {
			}
		}
		this.aString30 = "";
		this.aString31 = "";
		this.method489();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "l", descriptor = "()V")
	protected void method471() {
		System.out.println("Lost connection");
		this.anInt363 = 10;
		this.method469(this.aString30, this.aString31, true);
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	private void method472(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Graphics local2 = this.getGraphics();
		@Pc(9) Font local9 = new Font("Helvetica", 1, 15);
		@Pc(11) short local11 = 512;
		@Pc(13) short local13 = 344;
		local2.setColor(Color.black);
		local2.fillRect(local11 / 2 - 140, local13 / 2 - 25, 280, 50);
		local2.setColor(Color.white);
		local2.drawRect(local11 / 2 - 140, local13 / 2 - 25, 280, 50);
		this.method462(local2, arg0, local9, local11 / 2, local13 / 2 - 10);
		this.method462(local2, arg1, local9, local11 / 2, local13 / 2 + 10);
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected final void method473(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.anInt371 > 0) {
			this.method486(aStringArray28[6], aStringArray28[7]);
			try {
				Thread.sleep(2000L);
			} catch (@Pc(14) Exception local14) {
			}
			this.method486(aStringArray28[8], aStringArray28[9]);
			return;
		}
		try {
			@Pc(27) String local27 = Class11.method312(arg0, 20);
			@Pc(31) String local31 = Class11.method312(arg1, 20);
			this.method486(aStringArray28[6], aStringArray28[7]);
			this.aClass7_Sub1_2 = new Class7_Sub1(this.method465(this.aString29, this.anInt362), this);
			@Pc(55) int local55 = this.aClass7_Sub1_2.method275();
			this.anInt370 = local55;
			System.out.println("Session id: " + local55);
			@Pc(69) int local69 = 0;
			try {
				if (this.method453()) {
					@Pc(76) String local76 = this.getParameter("referid");
					local69 = Integer.parseInt(local76);
					@Pc(83) String local83 = this.getParameter("limit30");
					if (local83.equals("1")) {
						local69 += 50;
					}
				}
			} catch (@Pc(90) Exception local90) {
			}
			this.aClass7_Sub1_2.method285(2, 129);
			this.aClass7_Sub1_2.method279(anInt360);
			this.aClass7_Sub1_2.method281(Class11.method315(local27));
			this.aClass7_Sub1_2.method279(local69);
			this.aClass7_Sub1_2.method284(local31, local55, this.aBigInteger3, this.aBigInteger4);
			this.aClass7_Sub1_2.method280(this.method468());
			this.aClass7_Sub1_2.method288();
			this.aClass7_Sub1_2.method269();
			@Pc(133) int local133 = this.aClass7_Sub1_2.method269();
			this.aClass7_Sub1_2.method268();
			@Pc(142) int local142 = this.aClass7_Sub1_2.method286(local133, anIntArray167);
			System.out.println("Newplayer response: " + local142);
			if (local142 == 2) {
				this.method491();
			} else if (local142 == 3) {
				this.method486(aStringArray28[14], aStringArray28[15]);
			} else if (local142 == 4) {
				this.method486(aStringArray28[4], aStringArray28[5]);
			} else if (local142 == 5) {
				this.method486(aStringArray28[16], aStringArray28[17]);
			} else if (local142 == 6) {
				this.method486(aStringArray28[18], aStringArray28[19]);
			} else if (local142 == 7) {
				this.method486(aStringArray28[20], aStringArray28[21]);
			} else if (local142 == 11) {
				this.method486(aStringArray28[22], aStringArray28[23]);
			} else if (local142 == 12) {
				this.method486(aStringArray28[24], aStringArray28[25]);
			} else if (local142 == 13) {
				this.method486(aStringArray28[14], aStringArray28[15]);
			} else if (local142 == 14) {
				this.method486(aStringArray28[8], aStringArray28[9]);
				this.anInt371 = 1500;
			} else if (local142 == 15) {
				this.method486(aStringArray28[26], aStringArray28[27]);
			} else if (local142 == 16) {
				this.method486(aStringArray28[28], aStringArray28[29]);
			} else {
				this.method486(aStringArray28[12], aStringArray28[13]);
			}
		} catch (@Pc(302) Exception local302) {
			System.out.println(String.valueOf(local302));
			this.method486(aStringArray28[12], aStringArray28[13]);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "m", descriptor = "()V")
	protected final void method474() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (this.aClass7_Sub1_2.method290()) {
			this.aLong4 = local1;
		}
		if (local1 - this.aLong4 > 5000L) {
			this.aLong4 = local1;
			this.aClass7_Sub1_2.method285(5, 348);
			this.aClass7_Sub1_2.method287();
		}
		try {
			this.aClass7_Sub1_2.method289(20);
		} catch (@Pc(32) IOException local32) {
			this.method471();
			return;
		}
		if (this.method494()) {
			@Pc(45) int local45 = this.aClass7_Sub1_2.method277(this.aByteArray24);
			if (local45 > 0) {
				this.method475(this.aByteArray24[0] & 0xFF, local45);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(II)V")
	private void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = this.aClass7_Sub1_2.method286(arg0, anIntArray167);
		if (local7 == 8) {
			@Pc(20) String local20 = new String(this.aByteArray24, 1, arg1 - 1);
			this.method493(local20);
		}
		if (local7 == 9) {
			this.method470();
		}
		if (local7 == 10) {
			this.method490();
			return;
		}
		@Pc(46) int local46;
		if (local7 == 23) {
			this.anInt364 = Class11.method305(this.aByteArray24[1]);
			for (local46 = 0; local46 < this.anInt364; local46++) {
				this.aLongArray7[local46] = Class11.method308(this.aByteArray24, local46 * 9 + 2);
				this.anIntArray166[local46] = Class11.method305(this.aByteArray24[local46 * 9 + 10]);
			}
			this.method476();
			return;
		}
		@Pc(89) long local89;
		if (local7 == 24) {
			local89 = Class11.method308(this.aByteArray24, 1);
			@Pc(96) int local96 = this.aByteArray24[9] & 0xFF;
			for (@Pc(98) int local98 = 0; local98 < this.anInt364; local98++) {
				if (this.aLongArray7[local98] == local89) {
					if (this.anIntArray166[local98] == 0 && local96 != 0) {
						this.method493("@pri@" + Class11.method316(local89) + " has logged in");
					}
					if (this.anIntArray166[local98] != 0 && local96 == 0) {
						this.method493("@pri@" + Class11.method316(local89) + " has logged out");
					}
					this.anIntArray166[local98] = local96;
					this.method476();
					return;
				}
			}
			this.aLongArray7[this.anInt364] = local89;
			this.anIntArray166[this.anInt364] = local96;
			this.anInt364++;
			this.method493("@pri@" + Class11.method316(local89) + " has been added to your friends list");
			this.method476();
		} else if (local7 == 26) {
			this.anInt365 = Class11.method305(this.aByteArray24[1]);
			for (local46 = 0; local46 < this.anInt365; local46++) {
				this.aLongArray8[local46] = Class11.method308(this.aByteArray24, local46 * 8 + 2);
			}
		} else if (local7 == 27) {
			this.anInt366 = this.aByteArray24[1];
			this.anInt367 = this.aByteArray24[2];
			this.anInt368 = this.aByteArray24[3];
			this.anInt369 = this.aByteArray24[4];
		} else if (local7 == 28) {
			local89 = Class11.method308(this.aByteArray24, 1);
			@Pc(270) String local270 = Class12.method327(Class13.method352(this.aByteArray24, 9, arg1 - 9));
			this.method493("@pri@" + Class11.method316(local89) + ": tells you " + local270);
		} else {
			this.method492(local7, arg1, this.aByteArray24);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "n", descriptor = "()V")
	private void method476() {
		@Pc(3) boolean local3 = true;
		while (local3) {
			local3 = false;
			for (@Pc(9) int local9 = 0; local9 < this.anInt364 - 1; local9++) {
				if (this.anIntArray166[local9] < this.anIntArray166[local9 + 1]) {
					@Pc(27) int local27 = this.anIntArray166[local9];
					this.anIntArray166[local9] = this.anIntArray166[local9 + 1];
					this.anIntArray166[local9 + 1] = local27;
					@Pc(49) long local49 = this.aLongArray7[local9];
					this.aLongArray7[local9] = this.aLongArray7[local9 + 1];
					this.aLongArray7[local9 + 1] = local49;
					local3 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "c", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected final void method477(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(3) String local3 = Class11.method312(arg0, 20);
		@Pc(7) String local7 = Class11.method312(arg1, 20);
		this.aClass7_Sub1_2.method285(25, 551);
		this.aClass7_Sub1_2.method284(local3 + local7, this.anInt370, this.aBigInteger3, this.aBigInteger4);
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(IIII)V")
	protected final void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass7_Sub1_2.method285(31, 777);
		this.aClass7_Sub1_2.method278(arg0);
		this.aClass7_Sub1_2.method278(arg1);
		this.aClass7_Sub1_2.method278(arg2);
		this.aClass7_Sub1_2.method278(arg3);
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;)V")
	protected final void method479(@OriginalArg(0) String arg0) {
		@Pc(2) long local2 = Class11.method315(arg0);
		this.aClass7_Sub1_2.method285(29, 101);
		this.aClass7_Sub1_2.method281(local2);
		this.aClass7_Sub1_2.method287();
		for (@Pc(16) int local16 = 0; local16 < this.anInt365; local16++) {
			if (this.aLongArray8[local16] == local2) {
				return;
			}
		}
		if (this.anInt365 < 50) {
			this.aLongArray8[this.anInt365++] = local2;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(J)V")
	protected final void method480(@OriginalArg(0) long arg0) {
		this.aClass7_Sub1_2.method285(30, 511);
		this.aClass7_Sub1_2.method281(arg0);
		this.aClass7_Sub1_2.method287();
		for (@Pc(15) int local15 = 0; local15 < this.anInt365; local15++) {
			if (this.aLongArray8[local15] == arg0) {
				this.anInt365--;
				for (@Pc(32) int local32 = local15; local32 < this.anInt365; local32++) {
					this.aLongArray8[local32] = this.aLongArray8[local32 + 1];
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(Ljava/lang/String;)V")
	protected final void method481(@OriginalArg(0) String arg0) {
		this.aClass7_Sub1_2.method285(26, 622);
		this.aClass7_Sub1_2.method281(Class11.method315(arg0));
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(J)V")
	protected final void method482(@OriginalArg(0) long arg0) {
		this.aClass7_Sub1_2.method285(27, 707);
		this.aClass7_Sub1_2.method281(arg0);
		this.aClass7_Sub1_2.method287();
		label23: for (@Pc(15) int local15 = 0; local15 < this.anInt364; local15++) {
			if (this.aLongArray7[local15] == arg0) {
				this.anInt364--;
				@Pc(32) int local32 = local15;
				while (true) {
					if (local32 >= this.anInt364) {
						break label23;
					}
					this.aLongArray7[local32] = this.aLongArray7[local32 + 1];
					this.anIntArray166[local32] = this.anIntArray166[local32 + 1];
					local32++;
				}
			}
		}
		this.method493("@pri@" + Class11.method316(arg0) + " has been removed from your friends list");
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(J[BI)V")
	protected final void method483(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub1_2.method285(28, 185);
		this.aClass7_Sub1_2.method281(arg0);
		this.aClass7_Sub1_2.method283(arg1, 0, arg2);
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "([BI)V")
	protected final void method484(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass7_Sub1_2.method285(3, 643);
		this.aClass7_Sub1_2.method283(arg0, 0, arg1);
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "c", descriptor = "(Ljava/lang/String;)V")
	protected final void method485(@OriginalArg(0) String arg0) {
		this.aClass7_Sub1_2.method285(7, 293);
		this.aClass7_Sub1_2.method282(arg0);
		this.aClass7_Sub1_2.method287();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected void method486(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "o", descriptor = "()V")
	private void method487() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "p", descriptor = "()V")
	protected void method488() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "q", descriptor = "()V")
	protected void method489() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "r", descriptor = "()V")
	protected void method490() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "s", descriptor = "()V")
	protected void method491() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(II[B)V")
	protected void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "d", descriptor = "(Ljava/lang/String;)V")
	protected void method493(@OriginalArg(0) String arg0) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "t", descriptor = "()Z")
	private boolean method494() {
		return true;
	}
}
