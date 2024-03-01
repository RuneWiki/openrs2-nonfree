package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acv")
public class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!acv", name = "fa", descriptor = "Lclient!ny;")
	public static Class359 aClass359_4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!acv", name = "this$0", descriptor = "Lclient!hc;")
	final Class217 this$0;

	@OriginalMember(owner = "client!acv", name = "g", descriptor = "Z")
	boolean aBoolean167;

	@OriginalMember(owner = "client!acv", name = "l", descriptor = "Ljava/awt/Font;")
	Font aFont1;

	@OriginalMember(owner = "client!acv", name = "h", descriptor = "Ljava/awt/FontMetrics;")
	FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!acv", name = "x", descriptor = "Ljava/awt/Color;")
	Color aColor1;

	@OriginalMember(owner = "client!acv", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 37)
	public static void method7214(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class62_Sub1.method12871(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class13_Sub12.method16901(local1);
			local1 = Class476.method28797(local1);
			if (Class632.anApplet3 == null) {
				return;
			}
			@Pc(43) String local43 = "Unknown";
			@Pc(45) String local45 = "1.1";
			try {
				local43 = System.getProperty("java.vendor");
				local45 = System.getProperty("java.version");
			} catch (@Pc(53) Exception local53) {
			}
			@Pc(111) URL local111 = new URL(Class632.anApplet3.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub3.anInt2805 * -478844565 + "&cs=" + Class291.anInt4370 * 607315527 + "&u=" + (RuntimeException_Sub3.aString121 == null ? "" + RuntimeException_Sub1.aLong192 * 3362612962830757259L : Class476.method28797(RuntimeException_Sub3.aString121)) + "&v1=" + Class476.method28797(local43) + "&v2=" + Class476.method28797(local45) + "&e=" + local1);
			@Pc(117) DataInputStream local117 = new DataInputStream(local111.openStream());
			local117.read();
			local117.close();
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!acv", name = "bf", descriptor = "(III)I", line = 44)
	static int method7213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class456.aClass456_5.anInt5061 * 821735799 == arg0 || Class456.aClass456_14.anInt5061 * 821735799 == arg0 ? Class26_Sub1_Sub3_Sub2.anIntArray176[arg1 & 0x3] : Class26_Sub1_Sub3_Sub2.anIntArray177[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!acv", name = "<init>", descriptor = "(Lclient!hc;ZLjava/lang/String;IIII)V", line = 232)
	Class27_Sub1(@OriginalArg(0) Class217 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg5, arg6);
		this.this$0 = arg0;
		this.aBoolean167 = arg1;
		this.aFont1 = new Font(arg2, 0, arg3);
		this.aFontMetrics1 = Class106.aCanvas6.getFontMetrics(this.aFont1);
		this.aColor1 = new Color(arg4);
	}

	@OriginalMember(owner = "client!acv", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 242)
	@Override
	void method15267(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean167) {
			local6 = this.this$0.aString183;
		} else {
			local6 = this.this$0.aString184 + " " + this.this$0.aString183;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method24333(this.aFontMetrics1.stringWidth(local6)) + this.anInt2228 * 714162189, this.this$0.method24334(0) + this.anInt2227 * 1181499303);
	}

	@OriginalMember(owner = "client!acv", name = "a", descriptor = "(Ljava/awt/Graphics;)V", line = 242)
	@Override
	void method15268(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean167) {
			local6 = this.this$0.aString183;
		} else {
			local6 = this.this$0.aString184 + " " + this.this$0.aString183;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method24333(this.aFontMetrics1.stringWidth(local6)) + this.anInt2228 * 714162189, this.this$0.method24334(0) + this.anInt2227 * 1181499303);
	}

	@OriginalMember(owner = "client!acv", name = "g", descriptor = "(Ljava/awt/Graphics;)V", line = 242)
	@Override
	void method15270(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean167) {
			local6 = this.this$0.aString183;
		} else {
			local6 = this.this$0.aString184 + " " + this.this$0.aString183;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method24333(this.aFontMetrics1.stringWidth(local6)) + this.anInt2228 * 714162189, this.this$0.method24334(0) + this.anInt2227 * 1181499303);
	}

	@OriginalMember(owner = "client!acv", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 242)
	@Override
	void method15269(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean167) {
			local6 = this.this$0.aString183;
		} else {
			local6 = this.this$0.aString184 + " " + this.this$0.aString183;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method24333(this.aFontMetrics1.stringWidth(local6)) + this.anInt2228 * 714162189, this.this$0.method24334(0) + this.anInt2227 * 1181499303);
	}
}
