import javax.sound.midi.Receiver;
import javax.sound.midi.Sequencer;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Z")
	public static volatile boolean aBoolean129 = false;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Ljavax/sound/midi/Sequencer;")
	public static Sequencer aSequencer1 = null;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "Ljavax/sound/midi/Receiver;")
	public static Receiver aReceiver1 = null;
}
