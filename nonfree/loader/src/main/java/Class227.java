import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class227 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class227() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(B)[I")
	public int[] method6096() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local15[local17 << 2] = local3[local17].getWidth();
			local15[(local17 << 2) + 1] = local3[local17].getHeight();
			local15[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local15;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method6097(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IILjava/awt/Frame;BII)V")
	public void method6098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method6097(arg2);
		if (arg3 == 0) {
			@Pc(34) int local34 = this.aDisplayMode1.getRefreshRate();
			@Pc(38) DisplayMode[] local38 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < local38.length; local42++) {
				if (local38[local42].getWidth() == arg0 && local38[local42].getHeight() == arg1 && local38[local42].getBitDepth() == arg4) {
					@Pc(69) int local69 = local38[local42].getRefreshRate();
					if (!local40 || Math.abs(local69 - local34) < Math.abs(arg3 - local34)) {
						arg3 = local69;
						local40 = true;
					}
				}
			}
			if (!local40) {
				arg3 = local34;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg1, arg4, arg3));
	}

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "(B)V")
	public void method6099() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6097(null);
	}
}
