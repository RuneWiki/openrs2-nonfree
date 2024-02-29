package com.jagex;

import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ye")
public class Class664 {

	@OriginalMember(owner = "client!ye", name = "p", descriptor = "Lclient!ye;")
	public static final Class664 aClass664_1 = new Class664();

	@OriginalMember(owner = "client!ye", name = "c", descriptor = "Lclient!ye;")
	public static final Class664 aClass664_2 = new Class664();

	@OriginalMember(owner = "client!ye", name = "v", descriptor = "Lclient!ye;")
	static final Class664 aClass664_3 = new Class664();

	@OriginalMember(owner = "client!ye", name = "<init>", descriptor = "()V", line = 31)
	Class664() {
	}

	@OriginalMember(owner = "client!ye", name = "z", descriptor = "(Ljava/lang/String;B)I", line = 151)
	public static int method33107(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ye", name = "r", descriptor = "(Ljava/awt/image/BufferedImage;S)[I", line = 175)
	public static int[] method33108(@OriginalArg(0) BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = (local19[local32] << 16) + (local19[local32] << 8) + local19[local32] + -16777216;
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = (local19[local69] << 8) + (local19[local69] << 16) + (local19[local69 + 1] << 24) + local19[local69];
			}
		}
		return local26;
	}
}
