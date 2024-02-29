package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajb")
public abstract class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!ajb", name = "<init>", descriptor = "()V", line = 48)
	Class77_Sub3() {
	}

	@OriginalMember(owner = "client!ajb", name = "ct", descriptor = "(Lclient!yf;I)V", line = 4933)
	static final void method21803(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class82.method2024(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ajb", name = "aje", descriptor = "(Lclient!yf;I)V", line = 11226)
	static final void method21804(@OriginalArg(0) Class665 arg0) {
		@Pc(1) String local1 = "";
		if (Class161.aClipboard1 != null) {
			@Pc(7) Transferable local7 = Class161.aClipboard1.getContents(null);
			if (local7 != null) {
				try {
					local1 = (String) local7.getTransferData(DataFlavor.stringFlavor);
					if (local1 == null) {
						local1 = "";
					}
				} catch (@Pc(21) Exception local21) {
				}
			}
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local1;
	}

	@OriginalMember(owner = "client!ajb", name = "c", descriptor = "(Lclient!ajy;I)V")
	abstract void method21805(@OriginalArg(0) Class77_Sub25 arg0);

	@OriginalMember(owner = "client!ajb", name = "p", descriptor = "(Lclient!akv;I)V")
	abstract void method21806(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!ajb", name = "y", descriptor = "(Lclient!ajy;)V")
	abstract void method21807(@OriginalArg(0) Class77_Sub25 arg0);

	@OriginalMember(owner = "client!ajb", name = "v", descriptor = "(Lclient!akv;)V")
	abstract void method21808(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!ajb", name = "l", descriptor = "(Lclient!ajy;)V")
	abstract void method21809(@OriginalArg(0) Class77_Sub25 arg0);
}
