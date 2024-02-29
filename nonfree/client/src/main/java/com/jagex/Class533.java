package com.jagex;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public class Class533 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sg", name = "this$0", descriptor = "Lclient!sb;")
	final Class528 this$0;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "[S")
	short[] aShortArray137;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "[Lclient!jg;")
	Class341[] aClass341Array2;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "[Lclient!jg;")
	Class341[] aClass341Array3;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!jg;")
	Class341 aClass341_2;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
	int anInt5176;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "(I)V", line = 134)
	static void method30763() {
		if (Class157.anInt3245 * 431834035 < 102) {
			Class157.anInt3245 += -2067868446;
		}
		@Pc(24) int local24;
		if (Class157.anInt3242 * -1804400865 != -1 && Class330.aLong258 * 7283764449686237077L < Class280.method26667()) {
			for (local24 = Class157.anInt3242 * -1804400865; local24 < Class157.aStringArray23.length; local24++) {
				if (Class157.aStringArray23[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class157.aStringArray23[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class51.method764("Pausing for " + local36 + " seconds...");
					Class157.anInt3242 = (local24 + 1) * -556419873;
					Class330.aLong258 = (Class280.method26667() + (long) (local36 * 1000)) * 6271713210732061629L;
					return;
				}
				Class157.aString126 = Class157.aStringArray23[local24];
				Class647.method32851(false);
			}
			Class157.anInt3242 = 556419873;
		}
		if (client.anInt3465 * -1756158727 != 0) {
			Class157.anInt3247 -= client.anInt3465 * 643697769;
			if (Class157.anInt3247 * -596800939 >= Class157.anInt3240 * -1716872169) {
				Class157.anInt3247 = Class157.anInt3240 * -1262726981 - 719528701;
			}
			if (Class157.anInt3247 * -596800939 < 0) {
				Class157.anInt3247 = 0;
			}
			client.anInt3465 = 0;
		}
		for (local24 = 0; local24 < client.anInt3401 * 1779655715; local24++) {
			@Pc(127) Interface62 local127 = client.anInterface62Array1[local24];
			@Pc(131) int local131 = local127.method14158();
			@Pc(135) char local135 = local127.method14146();
			@Pc(139) int local139 = local127.method14149();
			if (local131 == 84) {
				Class647.method32851(false);
			}
			if (local131 == 80) {
				Class647.method32851(true);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Class161.aClipboard1 != null) {
					@Pc(164) String local164 = "";
					for (@Pc(169) int local169 = Class96_Sub12.aStringArray10.length - 1; local169 >= 0; local169--) {
						if (Class96_Sub12.aStringArray10[local169] != null && Class96_Sub12.aStringArray10[local169].length() > 0) {
							local164 = local164 + Class96_Sub12.aStringArray10[local169] + '\n';
						}
					}
					Class161.aClipboard1.setContents(new StringSelection(local164), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Class161.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class161.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class398.method28452(local225, '\n');
								Class631.method32613(local232);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local131 == 85 && Class157.anInt3244 * -1360080309 > 0) {
				Class157.aString126 = Class157.aString126.substring(0, Class157.anInt3244 * -1360080309 - 1) + Class157.aString126.substring(Class157.anInt3244 * -1360080309);
				Class157.anInt3244 -= 399107939;
			} else if (local131 == 101 && Class157.anInt3244 * -1360080309 < Class157.aString126.length()) {
				Class157.aString126 = Class157.aString126.substring(0, Class157.anInt3244 * -1360080309) + Class157.aString126.substring(Class157.anInt3244 * -1360080309 + 1);
			} else if (local131 == 96 && Class157.anInt3244 * -1360080309 > 0) {
				Class157.anInt3244 -= 399107939;
			} else if (local131 == 97 && Class157.anInt3244 * -1360080309 < Class157.aString126.length()) {
				Class157.anInt3244 += 399107939;
			} else if (local131 == 102) {
				Class157.anInt3244 = 0;
			} else if (local131 == 103) {
				Class157.anInt3244 = Class157.aString126.length() * 399107939;
			} else if (local131 == 104 && Class157.anInt3243 * 2030085227 < Class96_Sub12.aStringArray10.length) {
				Class157.anInt3243 += 1417472067;
				Class277.method26577();
				Class157.anInt3244 = Class157.aString126.length() * 399107939;
			} else if (local131 == 105 && Class157.anInt3243 * 2030085227 > 0) {
				Class157.anInt3243 -= 1417472067;
				Class277.method26577();
				Class157.anInt3244 = Class157.aString126.length() * 399107939;
			} else if (Class601.method32040(local135) || "\\/.:, _-+[]~@".indexOf(local135) != -1) {
				Class157.aString126 = Class157.aString126.substring(0, Class157.anInt3244 * -1360080309) + client.anInterface62Array1[local24].method14146() + Class157.aString126.substring(Class157.anInt3244 * -1360080309);
				Class157.anInt3244 += 399107939;
			}
		}
		client.anInt3401 = 0;
		client.anInt3468 = 0;
		Class430.method28815();
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!sb;)V", line = 174)
	Class533(@OriginalArg(0) Class528 arg0) {
		this.this$0 = arg0;
		this.aShortArray137 = new short[2];
		this.aClass341Array2 = new Class341[16];
		this.aClass341Array3 = new Class341[16];
		this.aClass341_2 = new Class341(8);
		this.anInt5176 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "(I)V", line = 177)
	void method30764(@OriginalArg(0) int arg0) {
		while (this.anInt5176 * -481611531 < arg0) {
			this.aClass341Array2[this.anInt5176 * -481611531] = new Class341(3);
			this.aClass341Array3[this.anInt5176 * -481611531] = new Class341(3);
			this.anInt5176 += 949222237;
		}
	}

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "(IS)V", line = 177)
	void method30765(@OriginalArg(0) int arg0) {
		while (this.anInt5176 * -481611531 < arg0) {
			this.aClass341Array2[this.anInt5176 * -481611531] = new Class341(3);
			this.aClass341Array3[this.anInt5176 * -481611531] = new Class341(3);
			this.anInt5176 += 949222237;
		}
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "(I)V", line = 177)
	void method30766(@OriginalArg(0) int arg0) {
		while (this.anInt5176 * -481611531 < arg0) {
			this.aClass341Array2[this.anInt5176 * -481611531] = new Class341(3);
			this.aClass341Array3[this.anInt5176 * -481611531] = new Class341(3);
			this.anInt5176 += 949222237;
		}
	}

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "(I)V", line = 177)
	void method30767(@OriginalArg(0) int arg0) {
		while (this.anInt5176 * -481611531 < arg0) {
			this.aClass341Array2[this.anInt5176 * -481611531] = new Class341(3);
			this.aClass341Array3[this.anInt5176 * -481611531] = new Class341(3);
			this.anInt5176 += 949222237;
		}
	}

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "()V", line = 184)
	void method30768() {
		Class350.method27880(this.aShortArray137);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5176 * -481611531; local5++) {
			this.aClass341Array2[local5].method27748();
			this.aClass341Array3[local5].method27748();
		}
		this.aClass341_2.method27748();
	}

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "()V", line = 184)
	void method30769() {
		Class350.method27880(this.aShortArray137);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5176 * -481611531; local5++) {
			this.aClass341Array2[local5].method27748();
			this.aClass341Array3[local5].method27748();
		}
		this.aClass341_2.method27748();
	}

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "()V", line = 184)
	void method30770() {
		Class350.method27880(this.aShortArray137);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5176 * -481611531; local5++) {
			this.aClass341Array2[local5].method27748();
			this.aClass341Array3[local5].method27748();
		}
		this.aClass341_2.method27748();
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(S)V", line = 184)
	void method30771() {
		Class350.method27880(this.aShortArray137);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5176 * -481611531; local5++) {
			this.aClass341Array2[local5].method27748();
			this.aClass341Array3[local5].method27748();
		}
		this.aClass341_2.method27748();
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()V", line = 184)
	void method30772() {
		Class350.method27880(this.aShortArray137);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5176 * -481611531; local5++) {
			this.aClass341Array2[local5].method27748();
			this.aClass341Array3[local5].method27748();
		}
		this.aClass341_2.method27748();
	}

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "(Lclient!jh;I)I", line = 193)
	int method30773(@OriginalArg(0) Class342 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method27779(this.aShortArray137, 0) == 0) {
			return this.aClass341Array2[arg1].method27753(arg0);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method27779(this.aShortArray137, 1) == 0) {
			local33 = local16 + this.aClass341Array3[arg1].method27753(arg0);
		} else {
			local33 = local16 + 8 + this.aClass341_2.method27753(arg0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "(Lclient!jh;I)I", line = 193)
	int method30774(@OriginalArg(0) Class342 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method27779(this.aShortArray137, 0) == 0) {
			return this.aClass341Array2[arg1].method27753(arg0);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method27779(this.aShortArray137, 1) == 0) {
			local33 = local16 + this.aClass341Array3[arg1].method27753(arg0);
		} else {
			local33 = local16 + 8 + this.aClass341_2.method27753(arg0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "(Lclient!jh;IB)I", line = 193)
	int method30775(@OriginalArg(0) Class342 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method27779(this.aShortArray137, 0) == 0) {
			return this.aClass341Array2[arg1].method27753(arg0);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method27779(this.aShortArray137, 1) == 0) {
			local33 = local16 + this.aClass341Array3[arg1].method27753(arg0);
		} else {
			local33 = local16 + 8 + this.aClass341_2.method27753(arg0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sg", name = "fw", descriptor = "(IZI)V", line = 1991)
	public static void method30776(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class307.method27255(arg0, Class44.aClass44_1.method713(Class128.aClass667_3), arg1);
	}

	@OriginalMember(owner = "client!sg", name = "rl", descriptor = "(Lclient!yf;B)V", line = 7728)
	static final void method30777(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class480.method29816(local11, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "akd", descriptor = "(Lclient!yf;I)V", line = 11336)
	static final void method30778(@OriginalArg(0) Class665 arg0) {
		Class674.method33277();
	}

	@OriginalMember(owner = "client!sg", name = "mo", descriptor = "(Ljava/lang/String;I)V", line = 12206)
	public static final void method30779(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(8) String local8 = Class471.method29622(arg0, Class33.aClass53_11);
		if (local8 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < client.anInt3532 * 2103713403; local14++) {
			@Pc(23) Class217 local23 = client.aClass217Array1[local14];
			@Pc(26) String local26 = local23.aString169;
			@Pc(31) String local31 = Class471.method29622(local26, Class33.aClass53_11);
			if (Class476.method29694(arg0, local8, local26, local31)) {
				client.anInt3532 -= 1662324915;
				for (@Pc(44) int local44 = local14; local44 < client.anInt3532 * 2103713403; local44++) {
					client.aClass217Array1[local44] = client.aClass217Array1[local44 + 1];
				}
				client.anInt3499 = client.anInt3413 * -664271315;
				@Pc(66) Class82 local66 = Class230.method25826();
				@Pc(72) Class77_Sub20 local72 = Class365.method28132(Class414.aClass414_5, local66.aClass16_1);
				local72.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0));
				local72.aClass77_Sub39_Sub1_2.method22440(arg0);
				local66.method2004(local72);
				break;
			}
		}
	}
}
