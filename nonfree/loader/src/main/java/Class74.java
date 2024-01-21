import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "loader!g", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!g", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!g", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!g", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!g", name = "i", descriptor = "I")
	private static final int anInt2886 = 1;

	@OriginalMember(owner = "loader!g", name = "k", descriptor = "Lloader!hd;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!g", name = "j", descriptor = "[Lloader!ne;")
	private Class76[] aClass76Array1;

	@OriginalMember(owner = "loader!g", name = "u", descriptor = "Lloader!ed;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "Lloader!ne;")
	private Class76 aClass76_1 = null;

	@OriginalMember(owner = "loader!g", name = "r", descriptor = "Lloader!ma;")
	private Class75 aClass75_1 = null;

	@OriginalMember(owner = "loader!g", name = "q", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!g", name = "h", descriptor = "I")
	private int anInt2884 = 0;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!g", name = "l", descriptor = "Lloader!ne;")
	private Class76 aClass76_2 = null;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	private int anInt2885 = 0;

	@OriginalMember(owner = "loader!g", name = "s", descriptor = "Lloader!ma;")
	private Class75 aClass75_2 = null;

	@OriginalMember(owner = "loader!g", name = "m", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!g", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		aString8 = "1.1";
		this.anInetAddress2 = arg2;
		this.anApplet2 = arg1;
		aString6 = "Unknown";
		try {
			aString6 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(49) Exception local49) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method2119(arg4, arg3, arg5);
		this.aBoolean173 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
	private void method2119(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString7, "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(80) boolean local80 = false;
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(87) int local87 = 0; local87 < local70.length; local87++) {
				for (@Pc(97) int local97 = 0; local97 < local45.length; local97++) {
					try {
						@Pc(105) String local105 = local45[local97];
						if (local105.length() > 0 && !(new File(local105)).exists()) {
							continue;
						}
						@Pc(133) File local133 = new File(local105 + local70[local87]);
						@Pc(144) boolean local144;
						if (local82 == 1 && !local133.exists()) {
							local144 = local133.mkdir();
							if (!local144) {
								continue;
							}
						}
						@Pc(169) int local169;
						@Pc(156) File local156;
						if (!local80) {
							try {
								local156 = new File(local133, "uid.dat");
								if (local82 == 1 && (!local156.exists() || local156.length() < 4L)) {
									local169 = -1;
									@Pc(173) Random local173 = new Random();
									while (local169 == -1) {
										local169 = local173.nextInt();
									}
									@Pc(189) DataOutputStream local189 = new DataOutputStream(new FileOutputStream(local156));
									local189.writeInt(local169);
									local189.close();
								}
								if (local156.exists()) {
									local80 = true;
									@Pc(207) DataInputStream local207 = new DataInputStream(new FileInputStream(local156));
									this.anInt2885 = local207.readInt() + 1;
									local207.close();
								}
							} catch (@Pc(217) Exception local217) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local133 = new File(local133, arg0);
								if (local82 == 1 && !local133.exists()) {
									local144 = local133.mkdir();
									if (!local144) {
										continue;
									}
								}
								local156 = new File(local133, "main_file_cache.dat2");
								if (local82 == 0 && !local156.exists()) {
									continue;
								}
								this.aClass76_1 = new Class76(local156, "rw", 52428800L);
								this.aClass76Array1 = new Class76[14];
								for (local169 = 0; local169 < 14; local169++) {
									this.aClass76Array1[local169] = new Class76(new File(local133, "main_file_cache.idx" + local169), "rw", 1048576L);
								}
								this.aClass76_2 = new Class76(new File(local133, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local133;
							} catch (@Pc(320) Exception local320) {
								try {
									this.aClass76_1.method2144();
									for (local169 = 0; local169 < 14; local169++) {
										this.aClass76Array1[local169].method2144();
									}
									this.aClass76_2.method2144();
								} catch (@Pc(343) Exception local343) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass76_1 = this.aClass76_2 = null;
								this.aClass76Array1 = null;
							}
						}
					} catch (@Pc(360) Exception local360) {
					}
					if (local80 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!g", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class75 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean173) {
						return;
					}
					if (this.aClass75_2 != null) {
						local17 = this.aClass75_2;
						this.aClass75_2 = this.aClass75_2.aClass75_3;
						if (this.aClass75_2 == null) {
							this.aClass75_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt2890;
				if (local46 == 1) {
					local17.anObject8 = new Socket(this.anInetAddress2, local17.anInt2891);
				} else if (local46 == 2) {
					@Pc(238) Thread local238 = new Thread((Runnable) local17.anObject7);
					local238.setDaemon(true);
					local238.start();
					local238.setPriority(local17.anInt2891);
					local17.anObject8 = local238;
				} else if (local46 == 4) {
					local17.anObject8 = new DataInputStream(((URL) local17.anObject7).openStream());
				} else {
					@Pc(175) Object[] local175;
					if (local46 == 9) {
						local175 = (Object[]) local17.anObject7;
						if (((Class) local175[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local175[0]).getDeclaredMethod((String) local175[1], (Class[]) local175[2]);
					} else if (local46 == 10) {
						local175 = (Object[]) local17.anObject7;
						if (((Class) local175[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local175[0]).getDeclaredField((String) local175[1]);
					} else if (local46 == 3) {
						@Pc(164) String local164 = (local17.anInt2891 >> 24 & 0xFF) + "." + (local17.anInt2891 >> 16 & 0xFF) + "." + (local17.anInt2891 >> 8 & 0xFF) + "." + (local17.anInt2891 & 0xFF);
						local17.anObject8 = InetAddress.getByName(local164).getHostName();
					} else if (local46 == 5) {
						local17.anObject8 = new Class76(new File(this.aFile5, "music" + this.anInt2884 + ".mid"), "rw", 1048576L);
						this.anInt2884 = (this.anInt2884 + 1) % 5;
					}
				}
				local17.anInt2889 = 1;
			} catch (@Pc(255) Exception local255) {
				local17.anInt2889 = 2;
			}
		}
	}
}
