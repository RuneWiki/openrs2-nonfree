package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
class Class244 implements Interface68 {

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	static int anInt3797;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fe", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "(Lclient!dx;IILclient!gm;S)V", line = 17)
	static void method26112(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class463.method29543(false, true);
			@Pc(31) int local31 = Class424.anIntArray462[local23];
			Class459.method29505(false, true);
			arg0.method20088(arg1, arg2 + ((63 - local5) * -1279656873 * arg3.anInt3875 >> 6), arg3.anInt3874 * -881188269, (arg3.anInt3875 * -1279656873 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z", line = 62)
	public static boolean method26113(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!Class524.aString226.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class31.method522(Class524.anApplet3, arg2, new Object[] { (new URL(Class524.anApplet3.getCodeBase(), arg0)).toString() });
				return local81 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				Class524.anApplet3.getAppletContext().showDocument(new URL(Class524.anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class31.method519(Class524.anApplet3, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				Class524.anApplet3.getAppletContext().showDocument(new URL(Class524.anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fw;)V", line = 586)
	Class244(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "(Lclient!vg;IIZI)V", line = 588)
	@Override
	public void method26109(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.this$0.method26258().add(arg0);
		if (arg3) {
			this.this$0.method26268().method25844(arg0, (long) arg2);
		} else {
			this.this$0.method26263().method25845(arg0, (long) arg2, arg0.method32160());
		}
	}

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "(Lclient!vg;IIZ)V", line = 588)
	@Override
	public void method26110(@OriginalArg(0) Interface69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.this$0.method26258().add(arg0);
		if (arg2) {
			this.this$0.method26268().method25844(arg0, (long) arg1);
		} else {
			this.this$0.method26263().method25845(arg0, (long) arg1, arg0.method32160());
		}
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(Lclient!vg;)V", line = 598)
	@Override
	public void method26111(@OriginalArg(0) Interface69 arg0) {
		if (arg0 != null) {
			this.this$0.method26263().method25835((long) arg0.method32165());
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(Lclient!vg;I)V", line = 598)
	@Override
	public void method26108(@OriginalArg(0) Interface69 arg0) {
		if (arg0 != null) {
			this.this$0.method26263().method25835((long) arg0.method32165());
		}
	}

	@OriginalMember(owner = "client!fe", name = "rn", descriptor = "(I)J", line = 7678)
	static final long method26114() {
		return (long) ((Class674.anInt5797 += -1282980117) * 1571172803 - 1) << 32 | 0xFFFFFFFFL;
	}

	@OriginalMember(owner = "client!fe", name = "afh", descriptor = "(Lclient!yf;I)V", line = 10193)
	static final void method26115(@OriginalArg(0) Class665 arg0) {
		if (Class118_Sub3.aClass687_1 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class118_Sub3.aClass687_1.anInt5871 * 1457930057;
		}
	}

	@OriginalMember(owner = "client!fe", name = "aio", descriptor = "(Lclient!yf;B)V", line = 10879)
	static final void method26116(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class131_Sub1.method12543(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, true);
	}
}
