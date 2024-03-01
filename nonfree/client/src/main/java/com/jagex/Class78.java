package com.jagex;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public class Class78 implements Interface10 {

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	final int anInt2909;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	final int anInt2910;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
	final int[] anIntArray275;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(II)V", line = 11)
	Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, new int[arg0 * arg1]);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(II[I)V", line = 14)
	Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt2909 = arg0 * -2017878325;
		this.anInt2910 = arg1 * -1728524085;
		this.anIntArray275 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "()I", line = 21)
	@Override
	public int method27214() {
		return this.anInt2909 * -282044701;
	}

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "()I", line = 21)
	@Override
	public int method27217() {
		return this.anInt2909 * -282044701;
	}

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "()I", line = 21)
	@Override
	public int method27213() {
		return this.anInt2909 * -282044701;
	}

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "()I", line = 25)
	@Override
	public int method27216() {
		return this.anInt2910 * -1706224413;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()I", line = 25)
	@Override
	public int method27212() {
		return this.anInt2910 * -1706224413;
	}

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "()I", line = 25)
	@Override
	public int method27211() {
		return this.anInt2910 * -1706224413;
	}

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "()I", line = 25)
	@Override
	public int method27215() {
		return this.anInt2910 * -1706224413;
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "()V", line = 28)
	@Override
	public void method27209() {
	}

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "()V", line = 28)
	@Override
	public void method27208() {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "()V", line = 28)
	@Override
	public void method27210() {
	}

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "(I)V", line = 133)
	static void method21585() {
		if (Class67.anInt1838 * -47428739 < 102) {
			Class67.anInt1838 += 1642636030;
		}
		@Pc(24) int local24;
		if (Class67.anInt1839 * -1678937237 != -1 && Class13_Sub4.aLong13 * 6789746077315813665L < Class176.method23413()) {
			for (local24 = Class67.anInt1839 * -1678937237; local24 < Class123.aStringArray10.length; local24++) {
				if (Class123.aStringArray10[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class123.aStringArray10[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class215.method24289("Pausing for " + local36 + " seconds...");
					Class67.anInt1839 = (local24 + 1) * 929964355;
					Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local36 * 1000)) * -2321551396921019679L;
					return;
				}
				Class67.aString61 = Class123.aStringArray10[local24];
				Class203.method24163(false);
			}
			Class67.anInt1839 = -929964355;
		}
		if (client.anInt3098 * -1965800379 != 0) {
			Class67.anInt1835 -= client.anInt3098 * 1572635567;
			if (Class67.anInt1835 * 393384311 >= Class67.anInt1840 * 1387788187) {
				Class67.anInt1835 = Class67.anInt1840 * -1116163075 - -1933731769;
			}
			if (Class67.anInt1835 * 393384311 < 0) {
				Class67.anInt1835 = 0;
			}
			client.anInt3098 = 0;
		}
		for (local24 = 0; local24 < client.anInt3154 * 1723265727; local24++) {
			@Pc(128) Interface46 local128 = client.anInterface46Array1[local24];
			@Pc(132) int local132 = local128.method11582();
			@Pc(136) char local136 = local128.method11581();
			@Pc(140) int local140 = local128.method11584();
			if (local132 == 84) {
				Class203.method24163(false);
			}
			if (local132 == 80) {
				Class203.method24163(true);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = Class67.aStringArray7.length - 1; local170 >= 0; local170--) {
						if (Class67.aStringArray7[local170] != null && Class67.aStringArray7[local170].length() > 0) {
							local165 = local165 + Class67.aStringArray7[local170] + '\n';
						}
					}
					Class146.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					try {
						@Pc(217) Transferable local217 = Class146.aClipboard1.getContents(null);
						if (local217 != null) {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Class230.method24546(local224, '\n');
								Class633.method33877(local231);
							}
						}
					} catch (@Pc(236) Exception local236) {
					}
				}
			} else if (local132 == 85 && Class67.anInt1837 * -1377464445 > 0) {
				Class67.aString61 = Class67.aString61.substring(0, Class67.anInt1837 * -1377464445 - 1) + Class67.aString61.substring(Class67.anInt1837 * -1377464445);
				Class67.anInt1837 -= 1751742251;
			} else if (local132 == 101 && Class67.anInt1837 * -1377464445 < Class67.aString61.length()) {
				Class67.aString61 = Class67.aString61.substring(0, Class67.anInt1837 * -1377464445) + Class67.aString61.substring(Class67.anInt1837 * -1377464445 + 1);
			} else if (local132 == 96 && Class67.anInt1837 * -1377464445 > 0) {
				Class67.anInt1837 -= 1751742251;
			} else if (local132 == 97 && Class67.anInt1837 * -1377464445 < Class67.aString61.length()) {
				Class67.anInt1837 += 1751742251;
			} else if (local132 == 102) {
				Class67.anInt1837 = 0;
			} else if (local132 == 103) {
				Class67.anInt1837 = Class67.aString61.length() * 1751742251;
			} else if (local132 == 104 && Class67.anInt1836 * 1487902593 < Class67.aStringArray7.length) {
				Class67.anInt1836 += -535254911;
				Class616.method33693();
				Class67.anInt1837 = Class67.aString61.length() * 1751742251;
			} else if (local132 == 105 && Class67.anInt1836 * 1487902593 > 0) {
				Class67.anInt1836 -= -535254911;
				Class616.method33693();
				Class67.anInt1837 = Class67.aString61.length() * 1751742251;
			} else if (Exception_Sub5.method14670(local136) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				Class67.aString61 = Class67.aString61.substring(0, Class67.anInt1837 * -1377464445) + client.anInterface46Array1[local24].method11581() + Class67.aString61.substring(Class67.anInt1837 * -1377464445);
				Class67.anInt1837 += 1751742251;
			}
		}
		client.anInt3154 = 0;
		client.anInt3144 = 0;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ar", name = "dj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4711)
	static final void method21586(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 1248498196;
		arg0.anInt3527 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 1490377677;
		arg0.anInt3528 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * 1707261097;
		arg0.anInt3529 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2] * 723396783;
		arg0.anInt3550 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3] * -309388021;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "afh", descriptor = "(Lclient!vs;B)V", line = 9863)
	static final void method21587(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!ar", name = "arl", descriptor = "(Lclient!vs;B)V", line = 12168)
	static final void method21588(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class30_Sub3.anInt848 * -284266725;
	}
}
