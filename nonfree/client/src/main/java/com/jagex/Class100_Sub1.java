package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agc")
public class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!agc", name = "ag", descriptor = "I")
	static int anInt946;

	// $FF: synthetic field
	@OriginalMember(owner = "client!agc", name = "this$0", descriptor = "Lclient!il;")
	final Class325 this$0;

	@OriginalMember(owner = "client!agc", name = "v", descriptor = "Z")
	boolean aBoolean165;

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "Ljava/awt/Font;")
	Font aFont1;

	@OriginalMember(owner = "client!agc", name = "y", descriptor = "Ljava/awt/FontMetrics;")
	FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!agc", name = "w", descriptor = "Ljava/awt/Color;")
	Color aColor1;

	@OriginalMember(owner = "client!agc", name = "<init>", descriptor = "(Lclient!il;ZLjava/lang/String;IIII)V", line = 238)
	Class100_Sub1(@OriginalArg(0) Class325 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg5, arg6);
		this.this$0 = arg0;
		this.aBoolean165 = arg1;
		this.aFont1 = new Font(arg2, 0, arg3);
		this.aFontMetrics1 = Class470.aCanvas6.getFontMetrics(this.aFont1);
		this.aColor1 = new Color(arg4);
	}

	@OriginalMember(owner = "client!agc", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 248)
	@Override
	void method18349(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}

	@OriginalMember(owner = "client!agc", name = "y", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method18353(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}

	@OriginalMember(owner = "client!agc", name = "c", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method18352(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}

	@OriginalMember(owner = "client!agc", name = "v", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method18351(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method18350(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}

	@OriginalMember(owner = "client!agc", name = "w", descriptor = "(Ljava/awt/Graphics;)V", line = 248)
	@Override
	void method18348(@OriginalArg(0) Graphics arg0) {
		@Pc(6) String local6;
		if (this.aBoolean165) {
			local6 = this.this$0.aString198;
		} else {
			local6 = this.this$0.aString199 + " " + this.this$0.aString198;
		}
		arg0.setFont(this.aFont1);
		arg0.setColor(this.aColor1);
		arg0.drawString(local6, this.this$0.method27501(this.aFontMetrics1.stringWidth(local6)) + this.anInt2546 * 1573756589, this.this$0.method27504(0) + this.anInt2545 * -1031843439);
	}
}
