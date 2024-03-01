package com.jagex;

import java.applet.Applet;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pz")
public interface Interface45 {

	@OriginalMember(owner = "client!pz", name = "stop", descriptor = "()V")
	void stop();

	@OriginalMember(owner = "client!pz", name = "init", descriptor = "()V")
	void init();

	@OriginalMember(owner = "client!pz", name = "start", descriptor = "()V")
	void start();

	@OriginalMember(owner = "client!pz", name = "ar", descriptor = "(Ljava/applet/Applet;)V")
	void method22222(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!pz", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V")
	void supplyApplet(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!pz", name = "cz", descriptor = "()V")
	void method22223();

	@OriginalMember(owner = "client!pz", name = "cd", descriptor = "(Ljava/awt/Graphics;)V")
	void method22224(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "am", descriptor = "(Ljava/applet/Applet;)V")
	void method22225(@OriginalArg(0) Applet arg0);

	@OriginalMember(owner = "client!pz", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	void update(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "cn", descriptor = "()V")
	void method22226();

	@OriginalMember(owner = "client!pz", name = "destroy", descriptor = "()V")
	void destroy();

	@OriginalMember(owner = "client!pz", name = "co", descriptor = "()V")
	void method22227();

	@OriginalMember(owner = "client!pz", name = "ci", descriptor = "(Ljava/awt/Graphics;)V")
	void method22228(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "ch", descriptor = "(Ljava/awt/Graphics;)V")
	void method22229(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "dl", descriptor = "()V")
	void method22230();

	@OriginalMember(owner = "client!pz", name = "ca", descriptor = "(Ljava/awt/Graphics;)V")
	void method22231(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "cr", descriptor = "(Ljava/awt/Graphics;)V")
	void method22232(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "ce", descriptor = "(Ljava/awt/Graphics;)V")
	void method22233(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pz", name = "de", descriptor = "()V")
	void method22234();

	@OriginalMember(owner = "client!pz", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	void paint(@OriginalArg(0) Graphics arg0);
}
