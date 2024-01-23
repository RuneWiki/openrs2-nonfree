import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!hi;")
	private static Class61 aClass61_5 = new Class61();

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "J")
	private static long aLong82 = 0L;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt2206 = 0;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt2208 = 0;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!hi;")
	private static Class61 aClass61_6 = new Class61();

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!hi;")
	private static Class61 aClass61_7 = new Class61();

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!hi;")
	private static Class61 aClass61_8 = new Class61();

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!hi;")
	private static Class61 aClass61_9 = new Class61();

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!hi;")
	private static Class61 aClass61_10 = new Class61();

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
	private static int[] anIntArray205 = new int[1000];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static synchronized void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2207) {
			@Pc(7) Class1_Sub29 local7 = new Class1_Sub29();
			local7.aLong205 = arg0;
			aClass61_8.method1839(local7);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public static synchronized void method1744() {
		anInt2207++;
		aClass61_5.method1845();
		aClass61_6.method1845();
		aClass61_7.method1845();
		aClass61_8.method1845();
		aClass61_9.method1845();
		aClass61_10.method1845();
		anInt2205 = 0;
		anInt2208 = 0;
		anInt2206 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lclient!fc;I)V")
	public static synchronized void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2207) {
			aClass61_9.method1839(new Class1_Sub9(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public static synchronized void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2207) {
			@Pc(8) Class1_Sub29 local8 = new Class1_Sub29(arg1);
			local8.aLong205 = arg0;
			aClass61_6.method1839(local8);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	public static synchronized void method1747() {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub29 local8 = (Class1_Sub29) aClass61_5.method1850();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray205, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub29) aClass61_6.method1850();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub29) aClass61_7.method1850();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray205, 0);
								}
								while (true) {
									local8 = (Class1_Sub29) aClass61_8.method1850();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub9 local136 = (Class1_Sub9) aClass61_9.method1850();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub29) aClass61_10.method1850();
													if (local8 == null) {
														if (anInt2205 + anInt2208 + anInt2206 > 100663296 && Static294.method4413() > aLong82 + 60000L) {
															System.gc();
															aLong82 = Static294.method4413();
														}
														return;
													}
													local126 = (int) local8.aLong205;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass43Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt468, local136.aClass43Array1[local126].anInt1516);
											}
											local1.glDeleteObjectARB(local136.anInt468);
										}
									}
									local126 = (int) local8.aLong205;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray205[local3++] = (int) local8.aLong205;
							anInt2206 -= local8.anInt4792;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray205, 0);
								local3 = 0;
							}
						}
					}
					anIntArray205[local3++] = (int) local8.aLong205;
					anInt2208 -= local8.anInt4792;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray205, 0);
						local3 = 0;
					}
				}
			}
			anIntArray205[local3++] = (int) local8.aLong205;
			anInt2205 -= local8.anInt4792;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray205, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public static synchronized void method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2207) {
			@Pc(8) Class1_Sub29 local8 = new Class1_Sub29(arg1);
			local8.aLong205 = arg0;
			aClass61_7.method1839(local8);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
	public static synchronized void method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2207) {
			@Pc(7) Class1_Sub29 local7 = new Class1_Sub29();
			local7.aLong205 = arg0;
			aClass61_10.method1839(local7);
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V")
	public static synchronized void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2207) {
			@Pc(8) Class1_Sub29 local8 = new Class1_Sub29(arg1);
			local8.aLong205 = arg0;
			aClass61_5.method1839(local8);
		}
	}
}
