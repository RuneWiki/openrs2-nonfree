import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!da")
public final class Class101 implements Runnable {

	@OriginalMember(owner = "loader!da", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!da", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!da", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!da", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!da", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!da", name = "n", descriptor = "I")
	private static final int anInt4473 = 1;

	@OriginalMember(owner = "loader!da", name = "f", descriptor = "Lloader!rh;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!da", name = "e", descriptor = "[Lloader!t;")
	private Class103[] aClass103Array1;

	@OriginalMember(owner = "loader!da", name = "b", descriptor = "Lloader!t;")
	private Class103 aClass103_2 = null;

	@OriginalMember(owner = "loader!da", name = "o", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!da", name = "i", descriptor = "Lloader!ha;")
	private Class102 aClass102_1 = null;

	@OriginalMember(owner = "loader!da", name = "g", descriptor = "Lloader!t;")
	private Class103 aClass103_1 = null;

	@OriginalMember(owner = "loader!da", name = "k", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "loader!da", name = "r", descriptor = "Lloader!t;")
	private Class103 aClass103_3 = null;

	@OriginalMember(owner = "loader!da", name = "j", descriptor = "Lloader!ha;")
	private Class102 aClass102_2 = null;

	@OriginalMember(owner = "loader!da", name = "p", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!da", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!da", name = "d", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!da", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!da", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class101(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString9 = "Unknown";
		this.anApplet2 = arg1;
		aString10 = "1.1";
		try {
			aString9 = System.getProperty("java.vendor");
			aString10 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
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
		this.method3330(arg2, arg3, arg4);
		this.aBoolean187 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!da", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class102 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean187) {
						return;
					}
					if (this.aClass102_1 != null) {
						local17 = this.aClass102_1;
						this.aClass102_1 = this.aClass102_1.aClass102_3;
						if (this.aClass102_1 == null) {
							this.aClass102_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local17.anInt4474;
				if (local45 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt4475);
				} else if (local45 == 2) {
					@Pc(195) Thread local195 = new Thread((Runnable) local17.anObject6);
					local195.setDaemon(true);
					local195.start();
					local195.setPriority(local17.anInt4475);
					local17.anObject5 = local195;
				} else if (local45 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(121) Object[] local121;
					if (local45 == 8) {
						local121 = (Object[]) local17.anObject6;
						if (((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local121[0]).getDeclaredMethod((String) local121[1], (Class[]) local121[2]);
					} else if (local45 == 9) {
						local121 = (Object[]) local17.anObject6;
						if (((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local121[0]).getDeclaredField((String) local121[1]);
					} else if (local45 == 3) {
						@Pc(110) String local110 = (local17.anInt4475 >> 24 & 0xFF) + "." + (local17.anInt4475 >> 16 & 0xFF) + "." + (local17.anInt4475 >> 8 & 0xFF) + "." + (local17.anInt4475 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local110).getHostName();
					} else {
						throw new Exception();
					}
				}
				local17.anInt4476 = 1;
			} catch (@Pc(224) ThreadDeath local224) {
				throw local224;
			} catch (@Pc(227) Throwable local227) {
				local17.anInt4476 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!da", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
	private void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(86) int local86 = 0; local86 < local34.length; local86++) {
					try {
						@Pc(94) String local94 = local34[local86];
						if (local94.length() > 0 && !(new File(local94)).exists()) {
							continue;
						}
						@Pc(118) File local118 = new File(local94 + local69[local76]);
						@Pc(129) boolean local129;
						if (local71 == 1 && !local118.exists()) {
							local129 = local118.mkdir();
							if (!local129) {
								continue;
							}
						}
						@Pc(142) File local142;
						if (this.aClass103_3 == null) {
							try {
								local142 = new File(local118, "random.dat");
								if (local71 == 1 || local142.exists()) {
									this.aClass103_3 = new Class103(local142, "rw", 25L);
								}
							} catch (@Pc(158) Exception local158) {
								this.aClass103_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(211) int local211;
							try {
								local118 = new File(local118, arg1);
								if (local71 == 1 && !local118.exists()) {
									local129 = local118.mkdir();
									if (!local129) {
										continue;
									}
								}
								local142 = new File(local118, "main_file_cache.dat2");
								if (local71 == 0 && !local142.exists()) {
									continue;
								}
								this.aClass103_1 = new Class103(local142, "rw", 104857600L);
								this.aClass103Array1 = new Class103[24];
								for (local211 = 0; local211 < 24; local211++) {
									this.aClass103Array1[local211] = new Class103(new File(local118, "main_file_cache.idx" + local211), "rw", 1048576L);
								}
								this.aClass103_2 = new Class103(new File(local118, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local118;
							} catch (@Pc(257) Exception local257) {
								try {
									this.aClass103_1.method3349();
									for (local211 = 0; local211 < 24; local211++) {
										this.aClass103Array1[local211].method3349();
									}
									this.aClass103_2.method3349();
								} catch (@Pc(280) Exception local280) {
								}
								this.aClass103_1 = this.aClass103_2 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass103Array1 = null;
							}
						}
					} catch (@Pc(297) Exception local297) {
					}
					if (this.aClass103_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
