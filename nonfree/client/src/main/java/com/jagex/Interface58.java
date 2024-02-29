package com.jagex;

import java.applet.Applet;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface58 {

	@OriginalMember(owner = "client!rd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	void paint(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "dv", descriptor = "(Ljava/awt/Graphics;)V")
	void method24829(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "ce", descriptor = "()V")
	void method24830();

	@OriginalMember(owner = "client!rd", name = "init", descriptor = "()V")
	void init();

	@OriginalMember(owner = "client!rd", name = "dn", descriptor = "(Ljava/awt/Graphics;)V")
	void method24831(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	void update(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "stop", descriptor = "()V")
	void stop();

	@OriginalMember(owner = "client!rd", name = "ap", descriptor = "(Ljava/applet/Applet;)V")
	void method24832(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!rd", name = "cd", descriptor = "()V")
	void method24833();

	@OriginalMember(owner = "client!rd", name = "cs", descriptor = "()V")
	void method24834();

	@OriginalMember(owner = "client!rd", name = "ej", descriptor = "()V")
	void method24835();

	@OriginalMember(owner = "client!rd", name = "cj", descriptor = "()V")
	void method24836();

	@OriginalMember(owner = "client!rd", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V")
	void supplyApplet(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!rd", name = "do", descriptor = "()V")
	void method24837();

	@OriginalMember(owner = "client!rd", name = "dt", descriptor = "()V")
	void method24838();

	@OriginalMember(owner = "client!rd", name = "dh", descriptor = "()V")
	void method24839();

	@OriginalMember(owner = "client!rd", name = "dq", descriptor = "(Ljava/awt/Graphics;)V")
	void method24840(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "aw", descriptor = "(Ljava/applet/Applet;)V")
	void method24841(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!rd", name = "start", descriptor = "()V")
	void start();

	@OriginalMember(owner = "client!rd", name = "da", descriptor = "(Ljava/awt/Graphics;)V")
	void method24842(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "destroy", descriptor = "()V")
	void destroy();

	@OriginalMember(owner = "client!rd", name = "eo", descriptor = "()V")
	void method24843();
}
