package com.jagex;

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class100 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jr", name = "this$0", descriptor = "Lclient!il;")
	final Class325 this$0;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	int anInt2546;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	int anInt2545;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!il;II)V", line = 184)
	Class100(@OriginalArg(0) Class325 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.this$0 = arg0;
		this.anInt2546 = arg1 * 1848603941;
		this.anInt2545 = arg2 * 1156419441;
	}

	@OriginalMember(owner = "client!jr", name = "ave", descriptor = "(Lclient!yf;B)V", line = 13130)
	static final void method18347(@OriginalArg(0) Class665 arg0) {
		if (client.aBoolean588) {
			Class413.aClass413_7.method28607();
		}
	}

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method18348(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "(Ljava/awt/Graphics;B)V")
	abstract void method18349(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method18350(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method18351(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method18352(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method18353(@OriginalArg(0) Graphics arg0);
}
