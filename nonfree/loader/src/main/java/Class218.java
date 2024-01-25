import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class218 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class218() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method6007(@OriginalArg(0) Frame arg0) {
		@Pc(8) boolean local8 = false;
		try {
			@Pc(13) Field local13 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local13.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local13.get(this.aGraphicsDevice1);
			if (local23) {
				local8 = true;
				local13.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local8) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(B)[I")
	public int[] method6008() {
		@Pc(15) DisplayMode[] local15 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(21) int[] local21 = new int[local15.length << 2];
		for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
			local21[local23 << 2] = local15[local23].getWidth();
			local21[(local23 << 2) + 1] = local15[local23].getHeight();
			local21[(local23 << 2) + 2] = local15[local23].getBitDepth();
			local21[(local23 << 2) + 3] = local15[local23].getRefreshRate();
		}
		return local21;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method6009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method6007(arg3);
		if (arg1 == 0) {
			@Pc(35) int local35 = this.aDisplayMode1.getRefreshRate();
			@Pc(39) DisplayMode[] local39 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < local39.length; local43++) {
				if (local39[local43].getWidth() == arg2 && local39[local43].getHeight() == arg4 && arg0 == local39[local43].getBitDepth()) {
					@Pc(74) int local74 = local39[local43].getRefreshRate();
					if (!local41 || Math.abs(local74 - local35) < Math.abs(arg1 - local35)) {
						local41 = true;
						arg1 = local74;
					}
				}
			}
			if (!local41) {
				arg1 = local35;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg4, arg0, arg1));
	}

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "(B)V")
	public void method6010() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6007(null);
	}
}
